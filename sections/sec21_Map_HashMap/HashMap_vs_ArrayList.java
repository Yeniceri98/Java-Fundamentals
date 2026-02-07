package sections.sec21_Map_HashMap;

import java.util.ArrayList;

public class HashMap_vs_ArrayList {
    public static void main(String[] args) {
//        // In the example below, the books have been stored in a list and searching for them is done by going through the list.
//        ArrayList<Book> books = new ArrayList<>();
//        Book firstBook = new Book("Lord of the Rings", 1995, "Written by Tolkien");
//        Book secondBook = new Book("Harry Potter", 2000, "Written by J. K. Rowling");
//        books.add(firstBook);
//        books.add(secondBook);
//
//        // Searching for a book named "Lord of the Rings":
//        Book match = null;
//
//        for (Book book : books) {
//            if (book.getName().equals("Lord of the Rings")) {
//                match = book;
//                break;
//            }
//        }
//
//        System.out.println("Book found ---> " + match);
//
//        // Searching for a book named "Harry Potter":
//        match = null;
//
//        for (Book book : books) {
//            if (book.getName().equals("Harry Potter")) {
//                match = book;
//                break;
//            }
//        }
//
//        System.out.println("Book found ---> " + match);

        // NOTE: "getCertainBook" adında metod oluşturup yukarıdakilerin daha düzenli durmasını sağladık. O yüzden yukarıyı yorum satırına aldım


        // Now the program is a bit more clear after creating "getCertainBook" method:
        ArrayList<Book> books = new ArrayList<>();
        Book firstBook = new Book("Lord of the Rings", 1995, "Written by Tolkien");
        Book secondBook = new Book("Harry Potter", 2000, "Written by J. K. Rowling");
        books.add(firstBook);
        books.add(secondBook);

        System.out.println(getCertainBook(books, "Lord of the Rings"));
        System.out.println(getCertainBook(books, "Harry Potter"));
        System.out.println(getCertainBook(books, "Sefiller"));              // Output: null
    }

    public static Book getCertainBook(ArrayList<Book> books, String name) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }
}


/*
    Hash map is implemented internally in such a way that searching by a key is very fast.
    Hash map generates a "hash value" from the key, i.e. a piece of code, which is used to store the value of a specific location.
    When a key is used to retrieve information from a hash map, this particular code identifies the location where the value associated with the key is.
    In practice, it's not necessary to go through all the key-value pairs in the hash map when searching for a key; the set that's checked is significantly smaller.

    Consider the library example that was introduced before.
    The whole program could just as well have been implemented using a list.
    In that case, the books would be placed on the list instead of the directory, and the book search would happen by iterating over the list.
*/
