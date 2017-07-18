package com.ccpg2.serviceimpl;

import com.ccpg2.dao.BookDao;
import com.ccpg2.daoimpl.BookDaoImpl;
import com.ccpg2.domain.Book;
import com.ccpg2.service.BookService;

/**
 * Created by lenovo on 2017/7/17.
 */
public class BookServiceImpl implements BookService{
    private BookDao dao = new BookDaoImpl();

    /**
     *初始化的方法。
     */
    public void init(){
        System.out.println("初始化");
    }
    @Override
    public boolean addBook(Book book) {
        return dao.addBook(book);
    }

    /**
     *销毁的方法
     */
    public void destroy(){
        System.out.println("销毁");
    }
}
