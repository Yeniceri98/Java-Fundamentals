package sections.sec28_Objects_On_The_List;

import java.util.ArrayList;

public class AmusementParkRide {
    private String name;
    private int minimumHeight;
    private int visitors;
    private ArrayList<Person> riding;

    public AmusementParkRide(String name, int minimumHeight) {
        this.name = name;
        this.minimumHeight = minimumHeight;
        this.visitors = 0;
        this.riding = new ArrayList<>();
    }

    public boolean isAllowedOn(Person person) {
        if (person.getHeight() < minimumHeight) {
            return false;
        }

        visitors++;
        riding.add(person);
        return true;
    }

    public void removeEveryoneOnRide() {
        riding.clear();
    }

    public String toString() {
        String onTheRide = "";
        for (Person person: riding) {
            onTheRide = onTheRide + person.getName() + "\n";
        }

        return name + ", minimum height requirement: " + minimumHeight + ", visitors: " + visitors + " riders:\n" + onTheRide;
    }
}
