package BookCatalog.BookCatalogController;

import BookCatalog.BookCatalogController.model.BookID;
import BookCatalog.Model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RestController
public class BookCatalogController {
    private Map<String, Book> bookCatalog;


    @PostMapping("/book")
    public ResponseEntity<BookID> createBook (@RequestBody final Book book) {
        System.out.println(book);
        BookID result = new BookID(UUID.randomUUID().toString());
        bookCatalog.put(result.getId(),book);
        return ResponseEntity.status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(result);
    }


    @GetMapping("/book/{id}")
    public Book getBookById (@PathVariable final String id) {
        System.out.println("Get Book by ID: " + id);
        return bookCatalog.get(id);
    }


    @PatchMapping("/book")
    public void patchProduct (@PathVariable String id, @RequestBody Book book) {
        bookCatalog.put(id,book);
    }


    @DeleteMapping("/book/{id}")
    public Book deleteBook (@PathVariable String id) {
        return bookCatalog.remove(id);
    }
}
