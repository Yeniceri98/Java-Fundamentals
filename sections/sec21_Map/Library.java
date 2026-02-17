package sections.sec21_Map;

import java.util.HashMap;

public class Library {
    private HashMap<String, Book> directory;        // The book is added to the hash map with the book name as the key and the book itself as the value.

    public Library() {
        this.directory = new HashMap<>();
    }

    public void addBook(Book book) {
        String name = book.getName();

        if (name == null) {
            name = "";
        }

        name = name.toLowerCase();
        name = name.trim();

        if (directory.containsKey(name)) {
            System.out.println("Book is already in the libary!");
        } else {
            directory.put(name, book);
        }
    }

    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }

    public Book getBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);
        return directory.get(bookTitle);
    }

    public void removeBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);

        if (directory.containsKey(bookTitle)) {
            directory.remove(bookTitle);
        } else {
            System.out.println("Book was not found, cannot be removed!");
        }
    }
}
