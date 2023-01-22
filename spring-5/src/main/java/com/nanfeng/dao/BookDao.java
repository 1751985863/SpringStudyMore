package com.nanfeng.dao;

import com.nanfeng.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BookDao {
    void add(Book book);

    void update(Book book);

    void delete(Book book);

    List<Book> findAll();


}
