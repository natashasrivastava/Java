package com.payment.api.paymentapi.user.SubscribedChannels;

public class subscribedChannels {
    private Integer userID;
    private Integer ID;
    String message;
    private Integer likeCount;
    private Integer dislikeCount;

    public subscribedChannels(Integer userID, Integer ID, String message, Integer likeCount, Integer dislikeCount) {
        this.userID = userID;
        this.ID = ID;
        this.message = message;
        this.likeCount = likeCount;
        this.dislikeCount = dislikeCount;
    }

    @Override
    public String toString() {
        return "posts{" +
                "userID=" + userID +
                ", ID=" + ID +
                ", message='" + message + '\'' +
                ", likeCount=" + likeCount +
                ", dislikeCount=" + dislikeCount +
                '}';
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
