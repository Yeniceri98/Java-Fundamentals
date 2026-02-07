package sections.sec28_Objects_On_The_List;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (meals.contains(meal)) {        // Listeye aynı meal eklenemeyecek
            return;
        }
        meals.add(meal);
    }

    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        meals.clear();
    }
}
