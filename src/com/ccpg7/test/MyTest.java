package com.ccpg7.test;

import com.ccpg7.domain.User;
import com.ccpg7.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/18.
 */
public class MyTest {
    @Test
    public void test1(){
        String xmlPath = "applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService service = (UserService)applicationContext.getBean("serviceId");
        User user = new User();
        user.setuAge(2);
        user.setuName("zhangsan");
        user.setuAge(222);
        service.registerUser(user);
    }
}
