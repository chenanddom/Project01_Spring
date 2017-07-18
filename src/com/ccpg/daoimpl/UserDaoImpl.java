package com.ccpg.daoimpl;

import com.ccpg.dao.UserDao;
import com.ccpg.domain.User;

/**
 *
 * Created by chendom on 2017/7/17.
 */
public class UserDaoImpl implements UserDao {
    @Override
    public boolean addUser(User user) {
        if(user!=null){
        System.out.println("注册成功!"+user.toString());
        return true;
        }else {
            return false;
        }
    }
}
