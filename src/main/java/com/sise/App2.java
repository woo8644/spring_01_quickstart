package com.sise;

import com.sise.dao.impl.BookDaoImpl;
import com.sise.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author WJF
 * @date
 */
public class App2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDaoImpl bookDao = (BookDaoImpl) context.getBean("bookDao");
        bookDao.save();

        BookServiceImpl bookService = (BookServiceImpl) context.getBean("bookService");
        bookService.save();
    }

}
