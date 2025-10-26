import java.util.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Library Management System ====");
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. View All Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;
                case 2:
                    System.out.print("Enter User ID: ");
                    String uid = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String uname = sc.nextLine();
                    library.registerUser(new User(uid, uname));
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    String bid = sc.nextLine();
                    System.out.print("Enter User ID: ");
                    String usid = sc.nextLine();
                    library.issueBook(bid, usid);
                    break;
                case 4:
                    System.out.print("Enter Book ID: ");
                    String rid = sc.nextLine();
                    library.returnBook(rid);
                    break;
                case 5:
                    library.showAllBooks();
                    break;
                case 6:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}
