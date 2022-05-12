package com.sise.service.impl;

import com.sise.dao.impl.BookDaoImpl;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author WJF
 * @date
 */
public class BookServiceImpl {
    //此处还是开发者自己new对象，管理对象-->DI可以解决这个问题
    private BookDaoImpl bookDao = new BookDaoImpl();

    //create bean by Spring
    //private BookDaoImpl bookDao;
    public void save (){
        System.out.println("service save to DB!!");
        bookDao.save();
    }

}
