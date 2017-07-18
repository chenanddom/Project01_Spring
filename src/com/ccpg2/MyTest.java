package com.ccpg2;

import com.ccpg2.domain.Book;
import com.ccpg2.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ccpg2.serviceimpl.*;

/**
 * Created by lenovo on 2017/7/17.
 */
public class MyTest {
    @Test
    public void test1(){
        String xmlPath="applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        BookService service = (BookServiceImpl)applicationContext.getBean("bookServiceId");
        Book book = new Book(Math.random()+"","asndajsdn");
        service.addBook(book);
        applicationContext.close();//只有关闭了才能执行自定义的销毁方法
    }
}
