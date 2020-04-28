import com.sun.tools.javac.tree.JCTree;

import java.util.ArrayList;
import java.util.SortedMap;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity) {
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (this.capacity > this.stockCount()) {
            this.stock.add(book);
        }
    }
}
