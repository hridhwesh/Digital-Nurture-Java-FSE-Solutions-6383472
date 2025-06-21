import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LMS {
    private static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        books.add(new Book("1", "Don Quixote", "Miguel de Cervantes"));
        books.add(new Book("2", "Alice's Adventures in Wonderland", "Lewis Carroll"));
        books.add(new Book("3", "The Adventures of Tom Sawyer", "Mark Twain"));
        books.add(new Book("4","Wuthering Heights","Emily Bronte"));
        books.add(new Book("5","Jane Eyre","Charlotte Bronte"));

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Search Book by Title (Linear Search)");
            System.out.println("2. Search Book by Title (Binary Search)");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    searchBookByTitleLinear(scanner);
                    break;
                case 2:
                    searchBookByTitleBinary(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void searchBookByTitleLinear(Scanner scanner) {
        System.out.print("Enter book title to search: ");
        String title = scanner.nextLine();

        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    private static void searchBookByTitleBinary(Scanner scanner) {
        System.out.print("Enter book title to search: ");
        String title = scanner.nextLine();
        
        books.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        int index = binarySearchByTitle(title);
        if (index != -1) {
            System.out.println("Book found: " + books.get(index));
        } else {
            System.out.println("Book not found.");
        }
    }

    private static int binarySearchByTitle(String title) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books.get(mid).getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; 
    }
}