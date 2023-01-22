package com.nanfeng.test;

import com.nanfeng.domain.Book;
import com.nanfeng.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class BookTest {


    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean10.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBookId("1");
        book.setBookName("wang");
        book.setBookStatus("true");
        bookService.addBook(book);
    }

    @Test
    public void testFindAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean10.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> all = bookService.findAll();
        System.out.println(all);

    }
}
