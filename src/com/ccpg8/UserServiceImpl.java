package com.ccpg8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/7/18.
 */
@Service
public class UserServiceImpl implements UserService {

private UserDao dao;
    @Autowired
    @Qualifier("DId")
   public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void registerUser(User user) {
        dao.addUser(user);
    }
}
