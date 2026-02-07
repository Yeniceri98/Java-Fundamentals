package sections.sec28_Objects_On_The_List;

import java.util.ArrayList;

public class Room {
    private ArrayList<Person2> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void addRoom(Person2 person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        boolean isRoomEmpty = false;

        if (persons.isEmpty()) {
            isRoomEmpty = true;
        }

        return isRoomEmpty;
    }

    public ArrayList<Person2> getPersons() {
        return persons;
    }

    // PART 2:
    public Person2 shortest() {
        if (persons.isEmpty()) {
            return null;
        }

        Person2 shortestPerson = persons.get(0);

        for (Person2 e : persons) {
            if (e.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = e;
            }
        }

        return shortestPerson;
    }

    // PART 3:
    public Person2 takeShortestPerson() {
        if (persons.isEmpty()) {
            return null;
        }

        Person2 shortestPerson = shortest();

        persons.remove(shortestPerson);

        return shortestPerson;
    }
}


/*
    PART 1: Room
    Create Room class. The class should contain a list of persons as an instance variable, and it should have a parameterless constructor.
    public void add(Person2 person) - add the person passed as a parameter to the list.
    public boolean isEmpty() - returns a boolean-type value true or false, that tells whether the room is empty or not.
    public ArrayList<Person2> getPersons() - returns a list of the persons in the room.

    PART 2: Shortest Person
    Add a public Person2 shortest() method to the Room class, which returns the shortest person added to the room.
    If the room is empty, a null reference is returned.
    The method should not remove a person from the room.

    PART 3: Taking from a Room
    Add a public Person removeShortestPerson() method to the Room class, which takes the shortest person in the room.
    When a room is empty, it returns a null reference.
*/