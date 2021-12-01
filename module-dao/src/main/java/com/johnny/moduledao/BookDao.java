package com.johnny.moduledao;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: Johnny
 * @date: 2021/11/29
 */
@Component
public class BookDao {
    public Book queryBook(){
        Book book = new Book();
        book.setName("a");
        book.setId(1L);
        return book;
    }
}
