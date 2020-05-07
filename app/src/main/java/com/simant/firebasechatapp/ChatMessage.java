package com.simant.firebasechatapp;

import java.util.Date;

//public class ChatMessage {
//
//    private String messageText;
//    private String messageUser;
//    private long messageTime;
//
//    public ChatMessage(String messageText, String messageUser) {
//        this.messageText = messageText;
//        this.messageUser = messageUser;
//
//        // Initialize to current time
//        messageTime = new Date().getTime();
//    }
//
//    public ChatMessage(){
//
//    }
//
//    public String getMessageText() {
//        return messageText;
//    }
//
//    public void setMessageText(String messageText) {
//        this.messageText = messageText;
//    }
//
//    public String getMessageUser() {
//        return messageUser;
//    }
//
//    public void setMessageUser(String messageUser) {
//        this.messageUser = messageUser;
//    }
//
//    public long getMessageTime() {
//        return messageTime;
//    }
//
//    public void setMessageTime(long messageTime) {
//        this.messageTime = messageTime;
//    }
//}

public class ChatMessage {
    private String messageText;
    private String messageUser;
    private long messageTime;
    private String image;

    public ChatMessage(String messageText, String messageUser, String image) {
        this.messageText = messageText;
        this.messageUser = messageUser;
        messageTime = new Date().getTime();
        this.image = image;
    }

    public ChatMessage() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

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
}