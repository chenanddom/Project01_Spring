package com.ccpg4.domain;

/**
 * Created by chendom on 2017/7/17.
 */
public class User {
    private int uId;
    private String uName;
    private int uAge;

    public User(int uId, String uName, int uAge) {
        this.uId = uId;
        this.uName = uName;
        this.uAge = uAge;
    }

    public User(int uId, String uName) {
        super();
        this.uId = uId;
        this.uName = uName;
    }
    public User(String uName, int uAge) {
        super();
        this.uName = uName;
        this.uAge = uAge;
    }
    public int getuId() {
        return uId;
    }
    public void setuId(int uId) {
        this.uId = uId;
    }
    public String getuName() {
        return uName;
    }
    public void setuName(String uName) {
        this.uName = uName;
    }
    public int getUage() {
        return uAge;
    }
    public void setUage(int uAge) {
        this.uAge = uAge;
    }
    @Override
    public String toString() {
        return "User [uId=" + uId + ", uName=" + uName + ", uAge=" + uAge + "]";
    }
}