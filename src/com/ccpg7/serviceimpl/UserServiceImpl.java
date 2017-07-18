package com.ccpg7.serviceimpl;

import com.ccpg7.dao.UserDao;
import com.ccpg7.service.UserService;
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
    public void registerUser(com.ccpg7.domain.User user) {
        dao.addUser(user);
    }
}
