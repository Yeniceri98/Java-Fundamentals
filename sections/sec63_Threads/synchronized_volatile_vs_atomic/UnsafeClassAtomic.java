package sections.sec63_Threads.synchronized_volatile_vs_atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class UnsafeClassAtomic {
    // private int counter;
    /*
        Main class'ta 5 * 10000 = 50000 sonucu dönmesini bekleriz fakat multithreading mevzusundan örneğin 48142 gibi bir sayı döner

        counter değerini "volatile" yapmak çözüm olmaz. yaparsak increment() metodunda ilgili alttaki uyarıyı verir:
        Non-atomic operation on volatile field 'counter'
        Çünkü volatile, atomicity sağlamaz

        "synchronized" keyword'ünü kullanırsak 50000 sonucunu görürüz fakat performans olarak ağır çalışır

        Bu yüzden best practice olarak Atomic sınıfı kullanımı önerilir. Atomic Sınıfları:
        - AtomicInteger
        - AtomicLong
        - AtomicBoolean
        - AtomicReference
    */
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        // counter++;
        counter.incrementAndGet();
    }

    public int getCounter() {
        // return counter;
        return counter.get();
    }
}

