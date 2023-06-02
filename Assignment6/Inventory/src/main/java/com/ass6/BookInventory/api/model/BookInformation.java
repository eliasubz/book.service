package BookInventory.Model;

public class BookInformation {
    private final String id;
    private int quantity;


    public BookInformation(String bookId, int quantity) {
        this.id = bookId;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
