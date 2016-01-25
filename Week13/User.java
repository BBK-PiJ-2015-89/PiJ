package Week13;

/**
 * Created by graemewilkinson on 18/01/16.
 */
public interface User {

    /* Users have a name and library ID, name is set here at construction time but ID is not. */

    String getName();

    int getID();

    void setID(int ID);

    /*Returns ID when library user added*/
    int register(Library library);

    /*Returns library name when called*/
    Library getLibrary();
}
