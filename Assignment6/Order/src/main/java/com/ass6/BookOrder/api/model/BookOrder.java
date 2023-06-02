package BookOrder.Model;

import java.util.Date;

public class BookOrder {

    private int bookId;
    private int quantity;
    private Date date;

    public BookOrder(int bookId, int quantity, Date date) {
        this.bookId = bookId;
        this.quantity = quantity;
        this.date = date;
    }

    public int getBookId() {
        return bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getDate() {
        return date;
    }
}
