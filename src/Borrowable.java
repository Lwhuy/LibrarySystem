// Interface for items that can be borrowed
public interface Borrowable {
    boolean borrowItem(Member member);
    boolean returnItem();
    boolean isBorrowed();
}

