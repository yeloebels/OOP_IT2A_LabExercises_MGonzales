// Base class
class LibraryItem {
    String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("Library Item: " + title);
    }
}

// Subclass for Book
class Book extends LibraryItem {
    public Book(String title) {
        super("Book - " + title);
    }
}

// Subclass for Magazine
class Magazine extends LibraryItem {
    public Magazine(String title) {
        super("Magazine - " + title);
    }
}

// Subclass for DVD
class DVD extends LibraryItem {
    public DVD(String title) {
        super("DVD - " + title);
    }
}

// Main class (entry point)
public class LibraryDiagram {
    public static void main(String[] args) {
        // Print hierarchy as ASCII diagram
        System.out.println("                LibraryItem");
        System.out.println("          ┌─────────┼──────────┐");
        System.out.println("         Book     Magazine   DVD\n");

        // Create instances
        LibraryItem book = new Book("Java Programming");
        LibraryItem magazine = new Magazine("National Geographic");
        LibraryItem dvd = new DVD("Avengers: Endgame");

        // Demonstrate inheritance
        System.out.println("=== Demonstrating Inheritance with Objects ===");
        book.displayInfo();
        magazine.displayInfo();
        dvd.displayInfo();
    }
}


