import java.util.*;

public class Library {
    private List<Book> books;
    private List<User> users;
    private Map<String, String> issuedBooks; // BookID -> UserID

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        issuedBooks = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered: " + user);
    }

    public void issueBook(String bookId, String userId) {
        for (Book b : books) {
            if (b.getId().equals(bookId) && !b.isIssued()) {
                b.issueBook();
                issuedBooks.put(bookId, userId);
                System.out.println("Book issued to " + userId);
                return;
            }
        }
        System.out.println("Book not available or already issued!");
    }

    public void returnBook(String bookId) {
        for (Book b : books) {
            if (b.getId().equals(bookId) && b.isIssued()) {
                b.returnBook();
                issuedBooks.remove(bookId);
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("Invalid Book ID or Book was not issued.");
    }

    public void showAllBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
