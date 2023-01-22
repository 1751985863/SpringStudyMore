package com.nanfeng.domain;

public class Book {
    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookId() {
        return BookId;
    }

    public void setBookId(String bookId) {
        BookId = bookId;
    }

    public String getBookStatus() {
        return BookStatus;
    }

    public void setBookStatus(String bookStatus) {
        BookStatus = bookStatus;
    }

    private String BookName;

    private String BookId;

    private String BookStatus;

    @Override
    public String toString() {
        return "Book{" +
                "BookName='" + BookName + '\'' +
                ", BookId='" + BookId + '\'' +
                ", BookStatus='" + BookStatus + '\'' +
                '}';
    }
}
