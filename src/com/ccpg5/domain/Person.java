package com.ccpg5.domain;


/**
 * Created by lenovo on 2017/7/18.
 */
public class Person {
    private String uId;
    private String uName;
    private DetailAddress address;
    public String getuId() {
        return uId;
    }
    public void setuId(String uId) {
        this.uId = uId;
    }
    public String getuName() {
        return uName;
    }
    public void setuName(String uName) {
        this.uName = uName;
    }
    public DetailAddress getAddress() {
        return address;
    }
    public void setAddress(DetailAddress address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Person{" +
                "uId='" + uId + '\'' +
                ", uName='" + uName + '\'' +
                ", address=" + address +
                '}';
    }
}
