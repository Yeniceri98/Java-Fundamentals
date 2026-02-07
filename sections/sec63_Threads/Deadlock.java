package sections.sec63_Threads;

public class Deadlock {
    // İki kilit nesnesi oluşturuluyor
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {

        // Thread 1
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Acquired lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Thread 1: Acquired lock2");
                }
            }
        });

        // Thread 2
        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Acquired lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("Thread 2: Acquired lock1");
                }
            }
        });

        // Thread'leri başlatıyoruz
        thread1.start();
        thread2.start();
    }
}

/*
    - Deadlock (ölümcül kilitlenme), iki veya daha fazla thread'in birbirlerini beklemesi sonucu oluşan bir durumdur
    - Bu thread'ler, her biri diğerinin sahip olduğu bir kaynağı (nesne, kilit, vs.) bekleyerek sonsuz bir bekleme döngüsüne girer
    - Sonuç olarak, bu thread'ler bir tür kilitlenme durumuna girer ve programın ilerlemesi durur
    - Deadlock'ı önlemek veya çözmek için iyi uygulama ve tasarım prensipleri kullanmak, kilitleme sırasını belirlemek ve zaman aşımı mekanizmalarını kullanmak önemlidir
*/