package sections.sec51_Interface;

public class Book implements Packables {
    private String author;
    private String bookName;
    private double weight;

    public Book(String author, String bookName, double weight) {
        this.author = author;
        this.bookName = bookName;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    public String toString() {
        return author + ": " + bookName;
    }
}
