import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowed;
    private String name;

    public Borrower(String name) {
        this.borrowed = new ArrayList<Book>();
        this.name = name;
    }

    public int booksCount() {
        return borrowed.size();
    }

    public Book borrow(Library library, Book book) {
        boolean success = library.removeBook(book);
        if (success) {
            borrowed.add(book);
            return book;
        };
        return null;
    }
}
