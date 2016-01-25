package Week13;

/**
 * Created by graemewilkinson on 18/01/16.
 */
public class UserImpl implements User{

    private String name;
    private int ID;
    private Library userLibrary;

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

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public int register(Library library) {
        this.userLibrary = library;
        this.ID =library.generateID();
        return ID;
    }

    @Override
    public Library getLibrary() {
        return null;
    }
}
