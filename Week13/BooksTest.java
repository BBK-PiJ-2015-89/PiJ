package Week13;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BooksTest {

    private Books playBook;
    private final static String title = "A silly Book";
    private final static String author = "Silly Man";

    @Before
    public void setup(){
        playBook = new BooksImpl(author, title);
    }

    @Test
    public void testTitleGetter(){
        assertEquals(title, playBook.getTitle());
    }

    @Test
    public void testAuthorGetter(){
        assertEquals(author, playBook.getAuthor());
    }

}