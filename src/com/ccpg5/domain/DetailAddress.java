package com.ccpg5.domain;

/**
 * Created by lenovo on 2017/7/18.
 */
public class DetailAddress {
    private int code;
    private String detail;
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "DetailAddress{" +
                "code=" + code +
                ", detail='" + detail + '\'' +
                '}';
    }
}
