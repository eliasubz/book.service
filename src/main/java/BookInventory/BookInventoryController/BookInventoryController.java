package BookInventory.BookInventoryController;

import BookInventory.Model.BookInformation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class BookInventoryController {

    private HashMap<String, BookInformation> inventory = new HashMap<>();

    @PostMapping
    public BookInformation postBookInInvetory(@RequestBody BookInformation info){
        inventory.put(info.getId(),info);
        return info;
    }

    @DeleteMapping
    public BookInformation deleteBookFromInvetory(@RequestBody BookInformation info){
        inventory.remove(info.getId());
        return info;
    }


    @GetMapping("/inventory")
    public HashMap<String, BookInformation> getInvetory(){
        return inventory;
    }

    @GetMapping("/{bookId}")
    public BookInformation getBookById(@PathVariable String bookId){
        return inventory.get(bookId);
    }

    @GetMapping("/{bookId}/quantity")
    public int getQuantity(@PathVariable String bookId){
        BookInformation info = inventory.get(bookId);
        return info != null ? info.getQuantity() : 0;
    }

    @PatchMapping("/{bookId}/quantity")
    public BookInformation updateBookQuantity(@PathVariable String bookId, @RequestParam int quantity){
        BookInformation info = inventory.get(bookId);
        if (info != null) {
            info.setQuantity(quantity);
            inventory.put(bookId, info);
        }
        return info;
    }







}
