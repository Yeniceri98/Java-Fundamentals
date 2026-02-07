package sections.sec63_Threads.synchronized_volatile_vs_atomic;

public class Synchronized {
    private static final Object lock = new Object(); // Senkronizasyon nesnesi
    private static int counter = 0;

    public static void main(String[] args) {

        // Producer Thread
        // Producer thread, counter 5 veya daha fazla olduğunda beklemeye geçer (lock.wait() metodu) ve Consumer thread'in counter'ı azaltmasını bekler
        Thread producer = new Thread(() -> {
            try {
                while (true) {
                    synchronized (lock) {
                        while (counter >= 5) {
                            System.out.println("Producer waiting...");
                            lock.wait();    // Beklemeye geçiyor
                        }
                        counter++;
                        System.out.println("Producer incremented counter to: " + counter);
                        lock.notify();      // Consumer thread'i uyandırılıyor (Bekleyen thread'lerin birini rastgele uyandırır. Zaten 2 thread olduğu için Consumer thread'ini uyandırmış olur)
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer Thread
        // Consumer thread, counter 0 veya daha az olduğunda beklemeye geçer (lock.wait() metodu) ve Producer thread'in counter'ı artırmasını bekler
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    synchronized (lock) {
                        while (counter <= 0) {
                            System.out.println("Consumer waiting...");
                            lock.wait();    // Beklemeye geçiyor
                        }
                        counter--;
                        System.out.println("Consumer decremented counter to: " + counter);
                        lock.notify();      // Producer thread'i uyandırılıyor
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread'leri başlatıyoruz
        producer.start();
        consumer.start();

        try {
            // Thread'lerin bitmesini bekliyoruz
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*
    synchronized & wait() & notify() & notifyAll()

    - "synchronized", bir nesne üzerinde eşzamanlı erişimi kontrol etmek için kullanılır
    - Bir nesne üzerinde synchronized blok kullanıldığında, diğer thread'ler aynı nesneye erişmek için sıraya girer

    - wait() metodu, bir thread'in synchronized blok veya yöntemde bir nesne üzerinde beklemesini sağlar
    - Thread, wait() metodu ile beklemeye geçerken nesnenin kilidini serbest bırakır
    - Başka bir thread, notify() veya notifyAll() metotları ile uyandırana kadar thread beklemede kalır
    - wait() metodu, InterruptedException atabilir

    - notify() metodu, bekleyen bir thread'i uyandırmak için kullanılır
    - synchronized blok veya yöntem içindeyken çağrılır
    - notify() metodu, bekleyen thread'lerden birini rastgele uyandırır

    - notifyAll() metodu, bekleyen tüm thread'leri uyandırmak için kullanılır
    - synchronized blok veya yöntem içindeyken çağrılır
    - Tüm bekleyen thread'ler uyanır ve kilit üzerinde sıraya girer
*/
