class LibraryItem {
    String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("Library item: " + title);
    }
}

class Book extends LibraryItem {
    public Book(String title) {
        super("Book - " + title);
    }
}

class Magazine extends LibraryItem {
    public Magazine(String title) {
        super("Magazine - " + title);
    }
}

class DVD extends LibraryItem {
    public DVD(String title) {
        super("DVD - " + title);
    }
}