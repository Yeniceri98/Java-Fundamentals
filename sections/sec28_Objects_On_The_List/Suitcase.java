package sections.sec28_Objects_On_The_List;

import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public int totalWeight() {
        int weight = 0;

        for (Item e : items) {
            weight += e.getWeight();
        }

        return weight;
    }

    public void addItem(Item item) {
        if ((totalWeight() + item.getWeight()) <= maximumWeight) {
            items.add(item);
        } else {
            return;
        }
    }

    public void printItems() {
        for (Item e : items) {
            System.out.println(e);
        }
    }

    public String toString() {
        // NOTE: Formatting yapmak için alt satırı yoruma aldım. Bu şekilde "0 items, 1 items" yazacağı için ingilizce bakımından hatalı durur
        // return items.size() + " items (" + totalWeight() + " kg)";

        String weightOutput = " (" + totalWeight() + " kg)";
        String itemOutput = "";

        if (items.isEmpty()) {
            itemOutput = "There is no items in the suitcase!";
        } else if (items.size() == 1) {
            itemOutput = "1 item";
        } else {
            itemOutput = items.size() + " items";
        }

        return itemOutput + weightOutput;
    }

    // Heaviest Item
    public Item heaviest() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviestItem = items.get(0);

        for (Item e : items) {
            if (e.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = e;
            }
        }

        return heaviestItem;
    }
}

/*
    The class Suitcase should ensure that the total weight of the items within it does not exceed the maximum weight limit.
    If that limit would be exceeded as a result of the item to be added, the method addItem should not add the new item to the suitcase.
*/
