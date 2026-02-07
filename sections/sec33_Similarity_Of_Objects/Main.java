package sections.sec33_Similarity_Of_Objects;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Book mb1 = new Book("Les Miserables", 1000, "Tolstoy");
        Book mb2 = new Book("Les Miserables", 1000, "Tolstoy");
        System.out.println(mb1.isEquals(mb2));  // true
        System.out.println(mb1 == mb2);         // false

         // Method to Test For Equality - "equals"
         /*
            equals() method checks by default whether the object given as a parameter has the same reference as the object it is being compared to
            If the reference is the same, the method returns true, and false otherwise
         */

        Book myBook1 = new Book("LOTR", 2000, "Tolkien");
        Book myBook2 = myBook1;

        if (myBook1.equals(myBook2)) {
            System.out.println("Books are the same");           // This will run
        } else {
            System.out.println("Books are not the same");
        }

        // NOTE: Yeni bir nesne oluşturulmuş oluyor ve myBook2 referansını bu yeni nesneye atmış oluyor
        myBook2 = new Book("LOTR", 2000, "Tolkien");

        if (myBook1.equals(myBook2)) {
            System.out.println("Books are the same");
        } else {
            System.out.println("Books are not the same");       // This will run
        }

        /*
            The internal structure of the book objects (i.e., the values of their instance variables ) in the previous example is the same, but only the first comparison prints "The books are the same"
            This is because the references are the same in the first case, i.e., the object is compared to itself
            The second comparison is about two different entities, even though the variables have the same values
        */

        /*
            If we want to compare our own classes using the "equals()" method, then it must be defined inside the class
            The method created accepts an Object-type reference as a parameter, which can be any object
            The comparison first looks at the references
            This is followed by checking the parameter object's type with the instanceof operation - if the object type does not match the type of our class, the object cannot be the same
        */

        // After arrangement in the class "Book":
        Book firstBook = new Book("Harry Potter", 2000, "Rowling");
        Book secondBook = new Book("Harry Potter", 2000, "Rowling");

        if (firstBook.isEquals(secondBook)) {                   // NOTE: Book classında "isEquals()" metodu oluşturduk
            System.out.println("Books are the same");           // This will run
        } else {
            System.out.println("Books are not the same");
        }


        /*
            The ArrayList also uses the equals() method in its internal implementation
            If we don't define the "equals" method in our objects, the contains() method of the ArrayList does not work properly
            If you try out the code below with two Book classes, one with the equals() method defined and another without it, you'll see the difference
        */
        ArrayList<Book> books = new ArrayList<>();
        Book bookObject = new Book("Book Object", 2000, "...");
        books.add(bookObject);

        if (books.contains(bookObject)) {
            System.out.println("Book Object was found");            // This will run
        } else {
            System.out.println("Book Object was not found!");
        }

        bookObject = new Book("Book Object", 2000, "...");

        if (books.contains(bookObject)) {
            System.out.println("Book Object was found");
        } else {
            System.out.println("Book Object was not found!");       // This will run
        }


        // Approximate Comparison With HashMap
        /*
             In addition to equals, the hashCode method can also be used for approximate comparison of objects.
             The method creates from the object a "hash code", i.e, a number, that tells a bit about the object's content.
             If two objects have the same hash value, they may be equal.
             On the other hand, if two objects have different hash values, they are certainly unequal.
        */
        HashMap<Book, String> borrowers = new HashMap<>();

        Book myBook = new Book("Empathy", 2010, "Adam Fawer");
        borrowers.put(myBook, "Pekka");
        borrowers.put(new Book("Test Driven Development", 1995, "..."), "Arto");

        System.out.println(borrowers.get(myBook));
        System.out.println(borrowers.get(new Book("Empathy", 2010, "Adam Fawer")));
        System.out.println(borrowers.get(new Book("Test Driven Development", 1995, "...")));
    }
}
