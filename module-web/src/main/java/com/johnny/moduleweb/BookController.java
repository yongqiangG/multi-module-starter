package com.johnny.moduleweb;

import com.johnny.moduledao.Book;
import com.johnny.moduleservice.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: Johnny
 * @date: 2021/11/29
 */
@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("queryBook")
    public Book queryBook() {
        return bookService.queryBook();
    }
}
