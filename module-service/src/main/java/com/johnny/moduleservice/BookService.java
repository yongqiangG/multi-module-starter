package com.johnny.moduleservice;

import com.johnny.moduledao.Book;
import com.johnny.moduledao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author: Johnny
 * @date: 2021/11/29
 */
@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    public Book queryBook() {
        return bookDao.queryBook();
    }
}
