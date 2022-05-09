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
    private BookDaoImpl bookDao = new BookDaoImpl();

    //create bean by Spring
    //private BookDaoImpl bookDao;
    public void save (){
        System.out.println("service save to DB!!");
        bookDao.save();
    }

}
