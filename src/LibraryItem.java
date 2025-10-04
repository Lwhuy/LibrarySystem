// Abstract base class for all items in the library
public abstract class LibraryItem {
    private String id;
    private String title;
    private String author;

    public LibraryItem(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Abstract method (forces subclasses to implement it)
    public abstract void displayInfo();
}

