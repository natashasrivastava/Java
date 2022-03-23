package com.payment.api.paymentapi.user;

import com.payment.api.paymentapi.Bank.Bank;
import com.payment.api.paymentapi.Bank.BankRepository;
import com.payment.api.paymentapi.SubscribedChannels.subscribedChannelsRepository;
import com.payment.api.paymentapi.exception.UserNotFoundException;
import com.payment.api.paymentapi.pay.Payment;
import com.payment.api.paymentapi.pay.PaymentDAO;
import com.payment.api.paymentapi.SubscribedChannels.subscribedChannels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.hateoas.EntityModel;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserResource {
    @Autowired
    public UserDAO service;
    @Autowired
    public PaymentDAO paymentDAO;
    @Autowired
    public UserRepository db;
    @Autowired
    public subscribedChannelsRepository channelsRepository;
    @Autowired
    public BankRepository banks;


    //retrieve all users
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return db.findAll();
    }

    //retrieveUser(int ID)
    @GetMapping("/user/{id}")
    public EntityModel<User> retrieveUser(@PathVariable int id){
        Optional<User> user = db.findById(id);
        if(!user.isPresent())
            throw new UserNotFoundException("User id - "+id + " Not found");
        EntityModel<User> model = EntityModel.of(user.get());
        WebMvcLinkBuilder linkToUsers = linkTo(methodOn(this.getClass()).retrieveAllUsers());
        model.add(linkToUsers.withRel("all-users"));
        return model;
    }

    //delete user
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable int id){
        db.deleteById(id);
    }

    //create user
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
        User createdUser = db.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/user/{id}/channels")
    public List<subscribedChannels> retrievePosts(@PathVariable int id) {
        Optional<User> user = db.findById(id);
        if (!user.isPresent())
            throw new UserNotFoundException("User id - " + id + " Not found");
        return user.get().getChannelsList();
    }

    @PostMapping("/user/{id}/channels")
    public ResponseEntity<Object> SubscribeChannel(@PathVariable int id, @RequestBody subscribedChannels channels){
        Optional<User> opUser = db.findById(id);
        if (!opUser.isPresent())
            throw new UserNotFoundException("User id - " + id + " Not found");

        User user = opUser.get();
        channels.setUser(user);
        channelsRepository.save(channels);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(channels.getID())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/bankaccounts")
    public List<Bank> showBankAccounts(){
        return banks.findAll();
    }

    @PostMapping("/user/{id}/pay")
    public String makePayment(@RequestBody Payment pay, @PathVariable int id){
        Optional<User> user = db.findById(id);
        if(!user.isPresent())
            throw new UserNotFoundException("User id - "+id + " Not found");
        boolean flag = paymentDAO.pay(pay);
        if(flag== true)
         return "Payment Successfull";
        else
            return "Payment Failed";

    }

}
