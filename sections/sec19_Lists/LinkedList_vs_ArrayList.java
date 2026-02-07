package sections.sec19_Lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_vs_ArrayList {

    public static void main(String[] args) {

        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Ahmet");
        namesLinkedList.add("Sami");
        namesLinkedList.add("Carl");
        namesLinkedList.addFirst("Anthony");    // Difference from ArrayList
        namesLinkedList.addLast("Susan");       // Difference from ArrayList
        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(1, "Jerry");
        System.out.println(namesLinkedList);

        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("Ana");
        System.out.println(namesArrayList.get(2));
    }
}

/*
    Genel implementasyonları "List" interface'ine ait olduğu için aynı olsa da arka planda farklı işlemler gerçekleşir
    ArrayList'te bir elemanı GET'lemek daha hızlıdır
    LinkedList'te bir elemanı eklemek veya silmek daha hızlıdır
*/