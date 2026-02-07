package sections.sec53_Generics.gc3_generics_example;

public class RestrictedList<T extends Number> {     // Sadece Number değerlerini listede tutabiliriz
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}


/*
    Sadece belirli bir data type'ı tutmak istersek kullanırız
    Bu örnekte de Number class'ı extends ettik
    Number Class ---> https://docs.oracle.com/javase/8/docs/api/java/lang/Number.html
*/
