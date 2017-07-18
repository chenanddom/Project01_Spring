package com.ccpg5.test;

import com.ccpg5.domain.Person;
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
        Person person = (Person)applicationContext.getBean("pId");
        System.out.println(person.toString());

    }
}
