import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Display All Books");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Show Member’s Borrowed Books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(id, title, author));
                }

                case 2 -> {
                    System.out.print("Enter Member ID: ");
                    String memberId = scanner.nextLine();
                    System.out.print("Enter Member Name: ");
                    String name = scanner.nextLine();
                    library.registerMember(new Member(memberId, name));
                }

                case 3 -> library.displayAllBooks();

                case 4 -> {
                    System.out.print("Enter Member ID: ");
                    String memId = scanner.nextLine();
                    Member member = library.findMemberById(memId);
                    if (member == null) {
                        System.out.println("Member not found!");
                        break;
                    }

                    System.out.print("Enter Book ID: ");
                    String bookId = scanner.nextLine();
                    Book book = library.findBookById(bookId);
                    if (book == null) {
                        System.out.println("Book not found!");
                        break;
                    }

                    member.borrowBook(book);
                }

                case 5 -> {
                    System.out.print("Enter Member ID: ");
                    String memId = scanner.nextLine();
                    Member member = library.findMemberById(memId);
                    if (member == null) {
                        System.out.println("Member not found!");
                        break;
                    }

                    System.out.print("Enter Book ID: ");
                    String bookId = scanner.nextLine();
                    Book book = library.findBookById(bookId);
                    if (book == null) {
                        System.out.println("Book not found!");
                        break;
                    }

                    member.returnBook(book);
                }

                case 6 -> {
                    System.out.print("Enter Member ID: ");
                    String memId = scanner.nextLine();
                    Member member = library.findMemberById(memId);
                    if (member == null) {
                        System.out.println("Member not found!");
                        break;
                    }
                    member.displayBorrowedBooks();
                }
            }
        }
    }
}
