package sections.sec27_Objects_and_References;

public class AmusementParkRide {
    private String name;
    private int lowestHeight;
    private int visitors;

    public AmusementParkRide(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
        this.visitors = 0;
    }

    // Aşağıda "Person" class'ını parametre olarak kullandık
    public boolean allowedToRide(Person person) {
        if (person.getHeight() < lowestHeight) {
            return false;
        }

        visitors++;
        return true;
    }

    public String toString() {
        return name + ", minimum height " + lowestHeight + ", visitors: " + visitors;
    }
}
