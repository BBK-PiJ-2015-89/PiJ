package Week13;

public class LibraryImpl implements Library{

    private String libraryName;
    private int libraryID;

    public LibraryImpl(String nameoflibrary){
        this.libraryName = nameoflibrary;
    }

    @Override
    public String getName() {
        return libraryName;
    }

    public int generateID(){
        return 14;
    }
}
