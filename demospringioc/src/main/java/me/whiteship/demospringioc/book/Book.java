package me.whiteship.demospringioc.book;

import java.util.Date;

public class Book {

    private Date created;

    private BookStatus bookStatus;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date creatd) {
        this.created = creatd;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }
}
