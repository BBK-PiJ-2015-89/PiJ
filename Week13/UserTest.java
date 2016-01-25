package Week13;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {

    private User testUser;
    private Library sampleLibrary;
    private final static String name = "Graeme";
    private final static String libraryName = "Library1";

    @Before
    public void setup(){
        testUser = new UserImpl(name);
        sampleLibrary = new LibraryImpl(libraryName);
    }

    @Test
    public void testNameGetter(){
        assertEquals(name, testUser.getName());
    }

    @Test
    public void testIDGetter(){
        assertEquals(-1, testUser.getID());
    }

    @Test
    public void testRegister(){
        assertEquals(14, testUser.register(sampleLibrary));
    }

    @Test
    public void testGetLibrary(){
        assertEquals(libraryName, sampleLibrary.getName());
    }
}
