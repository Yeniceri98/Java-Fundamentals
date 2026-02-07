package sections.sec51_Interface;

import java.util.ArrayList;

public class Box implements Packables{
    private double maxCapacity;
    private ArrayList<Packables> itemsInBox;
    private double weight;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.itemsInBox = new ArrayList<>();
    }

    // Interface as Method Parameter
    public void add(Packables itemToPack) {
        if (weight() + itemToPack.weight() <= maxCapacity) {
            itemsInBox.add(itemToPack);
        }
    }

    @Override
    public double weight() {
        double sum = 0;

        for (Packables e : itemsInBox) {
            sum += e.weight();
        }

        return (double) sum;
    }

    public String toString() {
        return "Box: " + itemsInBox.size() + " items, total weight " + weight() + " kg";
    }
}
