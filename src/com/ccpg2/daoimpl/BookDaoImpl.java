package com.ccpg2.daoimpl;

import com.ccpg2.dao.BookDao;
import com.ccpg2.domain.Book;


/**
 * Created by lenovo on 2017/7/17.
 */
public class BookDaoImpl implements BookDao {

    @Override
    public boolean addBook(Book book) {
        if(book!=null){
            System.out.println("添加书籍成功:"+book);
            return true;
        }else{
            return false;
        }
    }
}
