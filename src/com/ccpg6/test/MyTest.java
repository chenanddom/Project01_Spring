package com.ccpg6.test;

import com.ccpg6.domain.User;
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
        User  user = (User)applicationContext.getBean("uId");
        System.out.println(user.toString());
    }
}
