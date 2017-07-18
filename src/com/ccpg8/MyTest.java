package com.ccpg8;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/18.
 */
public class MyTest {
    @Test
    public void test1(){
        String xmlPath="applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserAction userAction=(UserAction) applicationContext.getBean("userActionId");
        User user = new User();
        user.setuId(1);
        user.setuName("张三");
        user.setuAge(22);
        userAction.executeAction(user);
    }
}
