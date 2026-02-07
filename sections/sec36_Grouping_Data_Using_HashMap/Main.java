package sections.sec36_Grouping_Data_Using_HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Ahmet", "1293012");
        phoneNumbers.put("Tom", "88293910");

        System.out.println("Ahmet's number is " + phoneNumbers.get("Ahmet"));
        System.out.println("Tom's number is " + phoneNumbers.get("Tom"));


        /*       
            What if we wanted to assign multiple values to a single key, such as multiple phone numbers for a given person?
            Since keys and values in a HashMap can be any variable, it is also possible to use lists as values in a HashMap
            You can add more values to a single key by attaching a list to the key
        */
        HashMap<String, ArrayList<String>> hobbies = new HashMap<>();
        hobbies.put("James", new ArrayList<>());

        hobbies.get("James").add("Swimming");
        hobbies.get("James").add("Reading book");
        hobbies.get("James").add("Watching TV");

        System.out.println("James' hobbies are " + hobbies.get("James"));


        // Exercise: Tracker program using "TaskTracker" class
        TaskTracker tracker = new TaskTracker();

        tracker.add("Kevin", 1);
        tracker.add("Kevin", 3);
        tracker.add("Kevin", 4);

        tracker.add("Melissa", 3);
        tracker.add("Melissa", 3);

        tracker.print();


        // Exercise: Translation program using "WordTranslation" class. It will list the word's different language translation.
        WordTranslation dict = new WordTranslation();

        dict.add("Bir", "One");
        dict.add("Bir", "Uno");
        dict.add("Bir", "Une");

        dict.add("İki", "Two");
        dict.add("İki", "Dos");
        dict.add("İki", "Deux");

        dict.print();

        System.out.println();
        System.out.println("After remove: ");
        dict.remove("İki");
        dict.print();
    }
}
