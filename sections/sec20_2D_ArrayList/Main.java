package sections.sec20_2D_ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> shoppingList = new ArrayList<>();      // Alttaki ArrayList'lerin tamamını kapsayan bir liste oluşturduk

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Tuna");
        bakeryList.add("Donut");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Tomatoes");
        produceList.add("Peppers");
        produceList.add("Potatoes");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("Cola");
        drinkList.add("Soda");
        drinkList.add("Ice tea");

        shoppingList.add(bakeryList);
        shoppingList.add(produceList);
        shoppingList.add(drinkList);

        System.out.println(shoppingList);                   // [[Pasta, Tuna, Donut], [Tomatoes, Peppers, Potatoes], [Cola, Soda, Ice tea]]
        System.out.println(shoppingList.get(1));            // [Tomatoes, Peppers, Potatoes]
        System.out.println(shoppingList.get(0).get(2));     // Donut
    }
}
