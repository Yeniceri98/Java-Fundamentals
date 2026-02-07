package sections.sec28_Objects_On_The_List;

import java.util.ArrayList;

public class Package {
    private int totalWeight;
    private ArrayList<Gift> gifts;

    public Package() {
        this.totalWeight = 0;
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int getTotalWeight() {
        for (Gift e : gifts) {
            totalWeight += e.getWeight();
        }
        return totalWeight;
    }
}
