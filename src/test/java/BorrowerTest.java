import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Borrower Daniel;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("Life of the cat", "Garfield", "drama");
        book2 = new Book("Life of the dog", "Bruno", "science fiction");
        book3 = new Book("Life of the giraffe", "Melman", "drama");
        Daniel = new Borrower("Daniel");
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void borrowerStartsWithNoBooks() {
        assertEquals(0, Daniel.booksCount());
    }

    @Test
    public void borrowerIsAbleToBorrow(){
        assertEquals(book1, Daniel.borrow(library, book1));
        assertEquals(1, Daniel.booksCount());
        assertEquals(1, library.stockCount());
    }

    @Test
    public void borrowerTryingToBorrowNomExistingBook(){
        assertEquals(null, Daniel.borrow(library, book3));
        assertEquals(0, Daniel.booksCount());
        assertEquals(2, library.stockCount());
    }

}
