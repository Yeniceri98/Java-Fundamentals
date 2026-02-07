package sections.sec21_Map_HashMap;

import java.util.HashMap;
import java.util.Map;

/*
    "Maps" are Key - Value pairs
    A HashMap is, in addition to ArrayList, one of the most widely used of Java's pre-built data structures
    It is used whenever data is stored as "key-value" pairs, where values can be added, retrieved, and deleted using keys

    Two type parameters are required when creating a HashMap:
    1) type of the key
    2) type of the value

    If the keys of the HashMap are of type String, and the values of type integer, the HashMap is created with the following statement:
    HashMap<String, Integer> hashmap = new HashMap<>();

    Adding to the HashMap is done through the "put(key, value)" method that has two parameters, one for the key, the other for the value
    Retrieving from a HashMap happens with the help of the "get(key)" method that is passed the key as a parameter and returns a value
*/
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> postalCodes = new HashMap<>();
        postalCodes.put("1111", "Helsinki");        // key: 1111, value: Helsinki
        postalCodes.put("2222", "Tokyo");
        postalCodes.put("3333", "London");
        postalCodes.put("4444", "Turkey");

        System.out.println(postalCodes);                                // {1111=Helsinki, 2222=Tokyo, 3333=London, 4444=Turkey}
        System.out.println(postalCodes.entrySet());                     // [1111=Helsinki, 2222=Tokyo, 3333=London, 4444=Turkey]
        System.out.println(postalCodes.get("1111"));                    // Helsinki
        System.out.println(postalCodes.getOrDefault("5555", "9999"));   // 9999 (since 5555 not found)
        System.out.println("Values: " + postalCodes.values());          // [Helsinki, Tokyo, London, Turkey]
        System.out.println("Keys: " + postalCodes.keySet());            // [1111, 2222, 3333, 4444]
        System.out.println(postalCodes.containsKey("5555"));            // false (check key)
        System.out.println(postalCodes.containsValue("Turkey"));        // true (check value)
        System.out.println(postalCodes.size());                         // length of the HashMap

        // Looping with entrySet()
        for (Map.Entry<String, String> entry : postalCodes.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // If the HashMap does not contained the key used for the search, its get method returns a "null" reference:
        HashMap<String, String> numbers = new HashMap<>();
        numbers.put("Bir", "One");
        numbers.put("İki", "Two");

        String translation = numbers.get("Bir");        // Bu şekilde ayrı bir variable'a atanabilir
        System.out.println(translation);                // One

        System.out.println(numbers.get("İki"));         // Two
        System.out.println(numbers.get("Üç"));          // null
        System.out.println(numbers.get("Dört"));        // null


        // Example: Nicknames
        HashMap<String, String> names = new HashMap<>();
        names.put("Matthew", "Matt");
        names.put("Michael", "Mike");
        names.put("Arthur", "Artie");

        System.out.println("Matthew's nickname is " + names.get("Matthew"));
        System.out.println("Michael's nickname is " + names.get("Michael"));
        System.out.println("Arthur's nickname is " + names.get("Arthur"));


        // Using Same Value Type More Than One
        // The HashMap has a maximum of 1 value per key
        // If a new key-value pair is added to the HashMap, but the key has already been associated with some other value stored in the HashMap, the old value will vanish from the HashMap
        HashMap<Integer, String> queue = new HashMap<>();
        queue.put(1, "Ahmet");
        queue.put(2, "Jasmine");
        queue.put(1, "Jack");

        System.out.println(queue.get(1));       // Jack (Son yazılan key değeri baz alınır)


        // Loop Through a HashMap
        HashMap<Integer, String> cityCode = new HashMap<>();
        cityCode.put(1, "Adana");
        cityCode.put(34, "Istanbul");
        cityCode.put(53, "Rize");

        // Use the values() method if you only want the "values"
        for (String i : cityCode.values()) {
            System.out.println(i);
        }

        // Use the keySet() method if you only want the "keys"
        for (int i : cityCode.keySet()) {
            System.out.println(i);
        }


        // A Reference Type Variable as a HashMap Value
        // We'll search books with the book title. If a book is found with the given search term, the library returns a reference to the book
        Book firstBook = new Book("Lord of the Rings", 1995, "Written by Tolkien");
        Book secondBook = new Book("Harry Potter", 2000, "Written by J. K. Rowling");

        HashMap<String, Book> directory = new HashMap<>();
        directory.put(firstBook.getName(), firstBook);
        directory.put(secondBook.getName(), secondBook);

        directory.put("Empathy", new Book("Empathy", 1990, "Written by Adam Fawer"));     // Yukarıdakilerden farklı olarak bu şekilde de oluşturulabilir

        System.out.println(directory.get("Lord of the Rings"));
        System.out.println(directory.get(firstBook.getName()));     // Bir üst satırdaki gibi de olur böyle de olur
        System.out.println(directory.get("Harry Potter"));
        System.out.println(directory.get("Empathy"));


        // HashMap as an Instance Variable
        /*
            The example considered above on storing books is problematic in that the book's spelling format must be remembered accurately
            Someone may search for a book with a lowercase letter, while another may, for example, enter a space to begin typing a name
            We make use of the tools provided by the String-class to handle strings
            toLowerCase() method creates a new string with all letters converted to lowercase
            trim() method, on the other hand, creates a new string where empty characters such as spaces at the beginning and end have been removed
        */

        String text = "      Love and Drugs";
        System.out.println(text.toLowerCase());     // Output:      love and drugs
        System.out.println(text.trim());            // Output: love and drugs

        // The conversion of the string described above will result in the book being found, even if the user happens to type the title of the book with lower-case letters.
        // Let's create a "Library" class that encapsulates a HashMap containing books, and enables you to case-independent search for books.
        // We'll add methods for adding, retrieving and deleting to the "Library" class.

        Book myBook1 = new Book("Da Vinci Code", 1980, "Nice book");
        Book myBook2 = new Book("Twister", 2005, "Remarkable book");

        Library library = new Library();
        library.addBook(myBook1);
        library.addBook(myBook2);

        System.out.println(library.getBook("da vinci code"));
        System.out.println(library.getBook("DA VINCI CODE"));
        System.out.println(library.getBook("twister"));
        System.out.println(library.getBook("TWISTER"));
    }
}
