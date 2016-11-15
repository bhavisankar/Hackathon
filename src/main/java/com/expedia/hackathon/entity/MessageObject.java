package com.expedia.hackathon.entity;

/**
 * Created by Bhavi on 14-11-2016.
 */


public class MessageObject {
    private String id;
    private String userName;
    private String fcm;

    public MessageObject(String id, String userName, String fcm) {
        this.id = id;
        this.userName = userName;
        this.fcm = fcm;
    }

    public MessageObject() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFcm() {
        return fcm;
    }

    public void setFcm(String fcm) {
        this.fcm = fcm;
    }
}
