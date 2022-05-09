package com.sise;

import com.sise.dao.impl.BookDaoImpl;
import com.sise.service.impl.BookServiceImpl;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author WJF
 * @date
 */
public class App {
    public static void main(String[] args) {
        BookServiceImpl bookService = new BookServiceImpl();

        bookService.save();
    }
}
