package sections.sec52_Built_in_Interfaces_Collections._3_List_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("S");
        list.add("Y");
        list.add(0, "A");           // NOTE: Collectionlarda index yoktu
        System.out.println(list);   // [A, S, Y]

        List<String> listTwo = new ArrayList<>();
        Collections.addAll(listTwo, "x","y");
        System.out.println(listTwo.get(0));

        List<Integer> listThree = new ArrayList<>();
        Collections.addAll(listThree, 3, 2, 1, 0);
        listThree.remove(0);                        // Indexine göre siler
        System.out.println(listThree);              // [2, 1, 0]

        List<Integer> listFour = new ArrayList<>();
        Collections.addAll(listFour, 10, 20, 20, 30);
        System.out.println(listFour.indexOf(20));   // 20 ile karşılaştığı ilk index olan 1'i return eder
    }
}
