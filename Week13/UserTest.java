package Week13;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {

    private User testUser;
    private final static String name = "Graeme";

    @Before
    public void setup(){
        testUser = new UserImpl(name);
    }

    @Test
    public void testNameGetter(){
        assertEquals(name, testUser.getName());
    }

    @Test
    public void testIDGetter(){
        assertEquals(-1, testUser.getID());
    }
}
