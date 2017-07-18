package com.ccpg7.daoimpl;

import com.ccpg7.domain.User;
import com.ccpg7.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2017/7/18.
 */
@Repository("DId")
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser(User user) {
        System.out.println("user....:"+user);
    }
}
