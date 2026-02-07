package sections.sec63_Threads.thread_runnable;

public class MainThree {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            AnotherMultithreadThing myThing = new AnotherMultithreadThing(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
            try {
                myThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

/*
    Diğerlerinden farklı olarak AnotherMultithread classından (implements Runnable) obje ürettik

    join()
    join kullanırsak thread'ler sırayla çalışır
*/