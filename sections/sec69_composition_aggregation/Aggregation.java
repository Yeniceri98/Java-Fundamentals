package sections.sec69_composition_aggregation;
import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println("Book: " + book.getTitle());
        }
    }
}

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("The Great Gatsby");
        Book book2 = new Book("1984");

        library.addBook(book1);
        library.addBook(book2);

        library.showBooks();    // Book: The Great Gatsby, Book: 1984
    }
}

/*
    Aggregation, bir sınıfın başka bir sınıfı içermesi, ancak bu ilişkinin "sahiplik" ilişkisi olmadığı bir durumu ifade eder
    Zayıf (loose coupled) bir ilişkidir, çünkü kapsayan nesne ve bileşen nesne birbirinden bağımsız olarak var olabilir

    Yukarıdaki örneğe göre Library sınıfı Book sınıfını içerir
    Ancak Library sınıfı ve Book sınıfı birbirinden bağımsızdır
    Library yok edilse bile, Book nesneleri yaşamaya devam eder
*/