package com.example.notify;

import com.google.firebase.database.ServerValue;

public class ReactData{

    private String postKey;
    private String reactKey;
    private String userName;
    private String reactId;



    private Object timeStamp ;


    public ReactData(String userName, String reactId) {
        String post;
        //this.title = title;

        this.userName = userName;
        this.reactId = reactId;
        this.timeStamp = ServerValue.TIMESTAMP;
    }

    // make sure to have an empty constructor inside ur model class
    public ReactData() {
    }


    public String getPostKey() {
        return postKey;
    }

    public void setReactKey(String reactKey) {
        this.reactKey = reactKey;
    }

    public String getReactKey() {
        return reactKey;
    }

    public void setPostKey(String postKey) {
        this.postKey = postKey;
    }

    public void setReactId(String reactId) {
        this.reactId = reactId;
    }


    public String getUserName() {
        return userName;
    }
    public String getReactId() {
        return reactId;
    }



    public Object getTimeStamp() {
        return timeStamp;
    }



    public void setTimeStamp(Object timeStamp) {
        this.timeStamp = timeStamp;
    }

}
