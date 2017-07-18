package com.ccpg3.test;

import com.ccpg3.lifecycle.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/17.
 */
public class MyTest {
    @Test
    public void test1(){
        String xmlPath="applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService)applicationContext.getBean("userServiceId");
        userService.addUser();
        applicationContext.close();
    }
}
