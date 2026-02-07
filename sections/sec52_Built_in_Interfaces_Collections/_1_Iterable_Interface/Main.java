package sections.sec52_Built_in_Interfaces_Collections._1_Iterable_Interface;

public class Main {
    public static void main(String[] args) {
        var list = new List<String>();
        list.add("A");
        list.add("B");
        for (var item : list)
            System.out.println(item);

    }
}


/*
    ___ Iterable Interface ___

    var myList = new List<String>();
    var iterator = list.iterator();
    while (iterator.hasNext()) {
        var current = iterator.next();
        System.out.println(current);
    }

    foreach'in çalışması mekanizması Iterable Interface'ine dayanır. Aslında arka planda aynı işler yürütülür
    Iterable'ın kullanılma sebebi, MyList.java'da array objesi oluşturduk. Fakat iterable'ın kullanılmadığı durumlarda koddaki objeyi örnek olarak ArrayList ile değiştirirsek list.length yaptığımızda hata verir çünkü ArrayList'te length metodu yoktur
*/

