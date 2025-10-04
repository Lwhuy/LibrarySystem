import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Registered member: " + member.getName());
    }

    public void displayAllBooks() {
        System.out.println("\n=== Library Books ===");
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public Book findBookById(String id) {
        for (Book b : books) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public Member findMemberById(String id) {
        for (Member m : members) {
            if (m.getMemberId().equals(id)) {
                return m;
            }
        }
        return null;
    }
}

