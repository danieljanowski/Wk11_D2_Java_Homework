import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("Life of the cat", "Garfield", "drama");
        book2 = new Book("Life of the dog", "Bruno", "science fiction");
        book3 = new Book("Life of the giraffe", "Melman", "drama");
    }

    @Test
    public void libraryStartsWithEmptyStock(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void ableToAddTheBook() {
        library.addBook(book1);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void notEnoughCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.stockCount());
        library.addBook(book3);
        assertEquals(2, library.stockCount());
    }

    @Test
    public void ableToRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(true, library.removeBook(book1));
        assertEquals(false, library.removeBook(book3));
        assertEquals(1, library.stockCount());
    }
}
