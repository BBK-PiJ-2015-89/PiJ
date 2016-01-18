package Week13;

/**
 * Created by graemewilkinson on 18/01/16.
 */
public class UserImpl implements User{

    private String name;
    private int ID;

    public UserImpl(String name) {
        this.name = name;
        ID = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getID() {
        return -1;
    }
}
