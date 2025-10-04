import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (book.borrowItem(this)) {
            borrowedBooks.add(book);
        }
    }

    public void returnBook(Book book) {
        if (book.returnItem()) {
            borrowedBooks.remove(book);
        }
    }

    public void displayBorrowedBooks() {
        System.out.println(name + " has borrowed:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("  No books borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println("  - " + book.getTitle());
            }
        }
    }
}
