package sections.sec53_Generics.gc3_generics_example;

public class Main {
    public static void main(String[] args) {

        // Restricted List
        // new RestrictedList<String>();             // Hata verir çünkü Number extend ettik
        var myList = new RestrictedList<Float>();
        myList.add(1.5f);
        float myNum = myList.get(0);
        System.out.println(myNum);
    }
}


/*
    Java'da "var" kullanılabilen durumlar: https://www.geeksforgeeks.org/var-keyword-in-java/
*/
