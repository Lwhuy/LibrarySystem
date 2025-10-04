// Book extends LibraryItem and implements Borrowable
public class Book extends LibraryItem implements Borrowable {
    private boolean borrowed;
    private Member borrowedBy;

    public Book(String id, String title, String author) {
        super(id, title, author);
        this.borrowed = false;
        this.borrowedBy = null;
    }

    @Override
    public boolean borrowItem(Member member) {
        if (!borrowed) {
            borrowed = true;
            borrowedBy = member;
            System.out.println(member.getName() + " borrowed: " + getTitle());
            return true;
        }
        System.out.println("Book already borrowed: " + getTitle());
        return false;
    }

    @Override
    public boolean returnItem() {
        if (borrowed) {
            borrowed = false;
            System.out.println("Book returned: " + getTitle());
            borrowedBy = null;
            return true;
        }
        System.out.println("Book was not borrowed: " + getTitle());
        return false;
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book ID: " + getId() +
                " | Title: " + getTitle() +
                " | Author: " + getAuthor() +
                " | Status: " + (borrowed ? "Borrowed" : "Available"));
    }
}
