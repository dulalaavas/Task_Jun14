interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    String title, author;
    int year;
    boolean available;

    Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public boolean isAvailable() { return available; }
}

public class Q8 {
    public static void main(String[] args) {
        LibraryItem book = new Book("1984", "George Orwell", 1949, true);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());
        System.out.println("Available: " + book.isAvailable());
    }
}
