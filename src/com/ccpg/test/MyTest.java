package com.ccpg.test;

import com.ccpg.domain.User;
import com.ccpg.service.UserService;
import com.ccpg.serviceimpl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.UUID;

/**
 * Created by lenovo on 2017/7/17.
 */
public class MyTest {
    @Test
    public void test1(){
    String xmlPath = "applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext(xmlPath);
       UserService userService = (UserServiceImpl) applicationContext.getBean("userServiceId");
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("张三");
        user.setAge(29);
       userService.registerUser(user);
    }
    @Test
    public void test2(){
    String xmlPath = "applicationContext.xml";
        Resource resource = new ClassPathResource(xmlPath);
        BeanFactory factory = new XmlBeanFactory(resource);
        UserService service = (UserServiceImpl)factory.getBean("userServiceId");
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("张三");
        user.setAge(29);
        service.registerUser(user);
    }
}
