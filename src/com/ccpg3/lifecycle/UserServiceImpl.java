package com.ccpg3.lifecycle;

import com.ccpg.domain.User;
import com.ccpg.service.*;

/**
 * Created by lenovo on 2017/7/17.
 */
public class UserServiceImpl implements com.ccpg3.lifecycle.UserService{

    @Override
    public void addUser() {
        System.out.println("add user success!!!");
    }
    public void myInit(){
        System.out.println("初始化");
    }
    public void myDestroy(){
        System.out.println("销毁");
    }
}
