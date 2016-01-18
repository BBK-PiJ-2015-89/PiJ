package Week13;

public class BooksImpl implements Books {

    private final String author;
    private final String title;

    public BooksImpl(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
