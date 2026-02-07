package sections.sec29_Learning_OOP;

public class Book {
    private String author;
    private String name;
    private int page;

    public Book(String author, String name, int page) {
        this.author = author;
        this.name = name;
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPage() {
        return page;
    }

    public String toString() {
        return author + " - " + name + " - " + page;
    }
}
