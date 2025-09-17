public class ProjectTester {
    public static void main(String[] args) {
        LibraryItem book = new Book("Java Programming");
        LibraryItem mag = new Magazine("Science Weekly");
        LibraryItem dvd = new DVD("Inception");

        book.displayInfo();
        mag.displayInfo();
        dvd.displayInfo();
    }
}
