package uh.ac.cr;

import java.util.Date;

public class Loan {
    private int Id;
    private User User;
    private Book Book;
    private Date withdrawal;
    private Date delivery;
    private Boolean Finished;

    public Loan(int id, uh.ac.cr.User user, uh.ac.cr.Book book, Date withdrawal, Date delivery, Boolean finished) {
        Id = id;
        User = user;
        Book = book;
        this.withdrawal = withdrawal;
        this.delivery = delivery;
        Finished = finished;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public uh.ac.cr.User getUser() {
        return User;
    }

    public void setUser(uh.ac.cr.User user) {
        User = user;
    }

    public uh.ac.cr.Book getBook() {
        return Book;
    }

    public void setBook(uh.ac.cr.Book book) {
        Book = book;
    }

    public Date getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(Date withdrawal) {
        this.withdrawal = withdrawal;
    }

    public Date getDelivery() {
        return delivery;
    }

    public void setDelivery(Date delivery) {
        this.delivery = delivery;
    }

    public Boolean getFinished() {
        return Finished;
    }

    public void setFinished(Boolean finished) {
        Finished = finished;
    }
}
