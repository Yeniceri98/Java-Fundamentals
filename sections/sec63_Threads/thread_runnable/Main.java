package sections.sec63_Threads.thread_runnable;

public class Main {
    public static void main(String[] args) {
        MultithreadThing myThing = new MultithreadThing();
        MultithreadThing myThing2 = new MultithreadThing();

        /*
            MultithreadThing classında run() metodu olmasına rağmen thread'li yapıda start() kullanmalıyız
            run() yaparsak 2 thread aynı anda değil sırayla çalışır. IDE de start() kullan diye uyarı verir
            MainTwo classında kısa yoldan for loop içerisinde birden çok thread çalıştırdık
        */
        myThing.start();
        myThing2.start();
    }
}

/*
    Thread yapısı oluşturmanın 2 yolu vardır:
    1) extends Thread --> MultithreadThing.java
    2) implements Runnable --> AnotherMultithreadThing.java

    NOTE: Runnable'ı implement ederek thread oluşturmak daha iyi bir yoldur çünkü bir class tek bir şeyi extend edebilir (single inheritance) fakat birden çok class'ı implemente edebilir
*/