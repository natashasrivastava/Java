package com.payment.api.paymentapi.user;

import com.payment.api.paymentapi.exception.UserNotFoundException;
import com.payment.api.paymentapi.pay.Payment;
import com.payment.api.paymentapi.pay.PaymentDAO;
import com.payment.api.paymentapi.user.SubscribedChannels.subscribedChannels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.hateoas.EntityModel;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserResource {
    @Autowired
    public UserDAO service;
    public PaymentDAO paymentDAO;



    //retrieve all users
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    //retrieveUser(int ID)
    @GetMapping("/user/{id}")
    public EntityModel<User> retrieveUser(@PathVariable int id){
        User user = service.findOne(id);
        if(user==null)
            throw new UserNotFoundException("User id - "+id + " Not found");
        EntityModel<User> model = EntityModel.of( user);
        WebMvcLinkBuilder linkToUsers = linkTo(methodOn(this.getClass()).retrieveAllUsers());
        model.add(linkToUsers.withRel("all-users"));
        return model;
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable int id){
        User user = service.deleteByID(id);
        if(user==null)
            throw new UserNotFoundException("User id - "+id + " Not found");
    }




    @GetMapping("/user/{id}/channels")
    public List<subscribedChannels> retrievePosts(@PathVariable int id){

        return service.findChannels(id);
    }
    @GetMapping("/user/{id}/channel/{cid}")
    public subscribedChannels retrieveUserPosts(@PathVariable int id, @PathVariable int cid){

        return service.findSingleChannels(id, cid);
    }

    @PostMapping("/userSubscribeChannels")
    public ResponseEntity<Object> SubscribeChannel(@RequestBody subscribedChannels channels){
        subscribedChannels createdPost = service.save(channels);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdPost.getID())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    //create user
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
        User createdUser = service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @PostMapping("/user/{id}/pay")
    public String makePayment(@RequestBody Payment pay, @PathVariable int id){
        User user = service.findOne(id);
        if(user==null)
            throw new UserNotFoundException("User id - "+id + " Not found");
        String message = paymentDAO.pay(pay);
        return message;

    }

}
