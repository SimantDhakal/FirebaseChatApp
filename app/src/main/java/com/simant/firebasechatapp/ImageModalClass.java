package com.simant.firebasechatapp;

import java.util.Date;

public class ImageModalClass {

    private String messageUser;
    private long messageTime;
    private String image;

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ImageModalClass(String messageUser, String image) {
        this.messageUser = messageUser;
        // Initialize to current time
        messageTime = new Date().getTime();
        this.image = image;
    }
}
