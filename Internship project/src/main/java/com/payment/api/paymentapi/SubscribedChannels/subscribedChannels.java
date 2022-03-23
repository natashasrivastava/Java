package com.payment.api.paymentapi.SubscribedChannels;

import com.payment.api.paymentapi.user.User;
import jdk.nashorn.internal.ir.annotations.Ignore;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Entity
public class subscribedChannels {


    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;
    @Id
    @GeneratedValue
    private Integer ID;
    private String channelName;
    private Integer likeCount;
    private Integer dislikeCount;

    @Override
    public String toString() {
        return "subscribedChannels{" +
                "ID=" + ID +
                ", channelName='" + channelName + '\'' +
                ", likeCount=" + likeCount +
                ", dislikeCount=" + dislikeCount +
                '}';
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getDislikeCount() {
        return dislikeCount;
    }

    public void setDislikeCount(Integer dislikeCount) {
        this.dislikeCount = dislikeCount;
    }


}
