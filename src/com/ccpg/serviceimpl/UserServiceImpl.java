package com.ccpg.serviceimpl;

import com.ccpg.dao.UserDao;
import com.ccpg.daoimpl.UserDaoImpl;
import com.ccpg.domain.User;
import com.ccpg.service.UserService;

/**
 * Created by lenovo on 2017/7/17.
 */
public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();
    @Override
    public boolean registerUser(User user) {
        return dao.addUser(user);
    }
}
