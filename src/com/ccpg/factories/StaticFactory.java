package com.ccpg.factories;

import com.ccpg.service.UserService;
import com.ccpg.serviceimpl.UserServiceImpl;

/**
 * Created by lenovo on 2017/7/17.
 */
public class StaticFactory {
    public static UserService getInstance(){
        return new UserServiceImpl();
    }
}
