package org.example.dao.impl;

import org.example.dao.BookDao;
import org.junit.jupiter.api.Test;

class BookDaoImplTest {

    BookDao bookDao = new BookDaoImpl();
    @Test
    void save() {
        bookDao.save();
    }
}