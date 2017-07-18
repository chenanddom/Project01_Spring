package com.ccpg4.test;

import com.ccpg4.domain.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/17.
 */
public class MyTest {
    @Test
    public void test1(){
        String xmlPath = "applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        User user  = (User) applicationContext.getBean("userId");
        System.out.println("user:"+user.toString());

    }
}
