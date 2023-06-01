package BookCatalog.Model;

public class Book {
    private final String BookID;
    private final String title;
    private final String author;
    private final int publicationYear;

    public Book(String bookID, String title, String author, int publicationYear) {
        BookID = bookID;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookID() {
        return BookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookID='" + BookID + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
