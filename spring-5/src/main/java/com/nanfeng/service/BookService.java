package com.nanfeng.service;

import com.nanfeng.dao.BookDao;
import com.nanfeng.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;


    public void addBook(Book book) {
        bookDao.add(book);
    }

    public void delBook(Book book) {
        bookDao.delete(book);
    }

    public void updateBook(Book book) {
        bookDao.update(book);

    }


    public List<Book> findAll() {
        return bookDao.findAll();
    }




}
