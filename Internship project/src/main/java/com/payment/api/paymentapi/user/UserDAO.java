package com.payment.api.paymentapi.user;

import com.payment.api.paymentapi.user.SubscribedChannels.subscribedChannels;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDAO {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 3;
    private static int postCount = 1;

    static {
        users.add(new User(1,"Natasha",new Date(), false,0,0));
        users.add(new User(2,"Pankaj", new Date(),true,0,0));
        users.add(new User(3,"Tushar", new Date(),false,0,1500));
    }
    private static List<subscribedChannels> Lposts = new ArrayList<>();
    static {
        Lposts.add(new subscribedChannels(1,10,"Hello Folks",12,3));
        Lposts.add(new subscribedChannels(2,10,"Hello, I am Natasha",2,31));
        Lposts.add(new subscribedChannels(1,10,"Hello Folks",12,38));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if(user.getId()==null){
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }
    public User findOne(int id){
        for(User user:users)
        {
            if (user.getId()==id)
                return user;
        }
        return null;
    }
    public User deleteByID(int id){
        Iterator<User> it = users.iterator();
        while (it.hasNext()){
            User user = it.next();
            if (user.getId()==id){
                it.remove();
                return user;
            }
        }
        return null;
    }

    public List<subscribedChannels> findChannels(int id) {
        List<subscribedChannels> channels = new ArrayList<>();
        for(subscribedChannels post : Lposts){
            if(post.getUserID()==id)
            {
                channels.add(post);
            }
        }
        return channels;
    }

    public subscribedChannels findSingleChannels(int id, int cid) {

        for(subscribedChannels post : Lposts){
            if(post.getUserID()==id && post.getID()==cid )
            {
                return post;
            }
        }
        return null;

    }

    public subscribedChannels save(subscribedChannels channels){
        if(channels.getID()==null){
            channels.setID(++postCount);
        }
        Lposts.add(channels);
        return channels;
    }





}
