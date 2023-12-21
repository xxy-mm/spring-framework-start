package org.example.service.impl;

import org.example.service.BookService;
import org.junit.jupiter.api.Test;

class BookServiceImplTest {

    BookService bookService = new BookServiceImpl();
    @Test
    void save(){
        bookService.save();
    }
}