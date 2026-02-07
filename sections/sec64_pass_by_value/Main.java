package sections.sec64_pass_by_value;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Primitive Type
    public static void modifyPrimitive(int value) {
        value = value + 10;
        System.out.println("Metod içinde (primitive): " + value);               // 15
    }

    // Reference Type
    public static void modifyList(List<Integer> list) {
        list.add(10); // List'in içeriğini değiştirir
        System.out.println("Metod içinde (reference): " + list);                // [1, 10]
    }

    public static void main(String[] args) {
        int primitiveValue = 5;
        System.out.println("Metod öncesi (primitive): " + primitiveValue);      // 5
        modifyPrimitive(primitiveValue);
        System.out.println("Metod sonrası (primitive): " + primitiveValue);     // 5

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        System.out.println("Metod öncesi (reference): " + myList);              // [1]
        modifyList(myList);
        System.out.println("Metod sonrası (reference): " + myList);             // [1, 10]
    }
}

/*
    Primitive Type:
    int türündeki primitiveValue, modifyPrimitive() metoduna bir kopya olarak iletilir
    Metod içinde yapılan değişiklik, orijinal değişkeni etkilemez

    Reference Type:
    List<Integer> türündeki myList, modifyList() metoduna bir kopya olarak iletilir
    Ancak, bu kopya bir referanstır (listenin bellekteki adresi)
    Metod içinde liste üzerinde yapılan değişiklikler orijinal listeyi etkiler çünkü listede depolanan nesneye referans verilir
*/
