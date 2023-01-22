package com.nanfeng.dao;

import com.nanfeng.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void add(Book book) {

        String sql = "insert into t_book values(?,?,?)";
        jdbcTemplate.update(sql,book.getBookId(),book.getBookName(),book.getBookStatus());
    }

    @Override
    public void update(Book book) {
        String sql = "update t_book set book_name = ? where book_id = ?";
        jdbcTemplate.update(sql,book.getBookName(),book.getBookId());

    }

    @Override
    public void delete(Book book) {
        String sql = "delete from t_book where book_id = ?";
        jdbcTemplate.update(sql,book.getBookId());

    }

    @Override
    public List<Book> findAll() {

        String sql = "select * from t_book";
        List<Book> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
        return query;
    }
}
