package sections.sec63_Threads.synchronized_volatile_vs_atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainVolatile {
    public static void main(String[] args) {
        final UnsafeClassVolatile myClass = new UnsafeClassVolatile();
        final int numOfThreads = 2;

        // try with resources (Executor otomatik kapanmış olur)
        try (final ExecutorService executorService = Executors.newFixedThreadPool(numOfThreads)) {
            executorService.submit(() -> {  // first thread
                try {
                    myClass.loop();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            });
            executorService.submit(myClass::waitToFinish);  // second thread
        };
    }
}

/*
    volatile, bir değişkenin:
    - thread’ler arası görünürlüğünü (visibility) garanti eder
    - CPU cache / register’da tutulmasını engeller
    - reordering (yeniden sıralama) optimizasyonlarını sınırlar
    - Atomicity sağlamaz

    1) volatile Neyi Garanti Eder?
    private volatile boolean running = true;
    Bir thread running = false yaparsa, diğer thread mutlaka güncel değeri görür

    2) volatile Neyi Garanti Etmez?
    private volatile int count = 0;
    public void increment() {
        count++; // ❌ atomic değil
    }
    count++ üç adımdır: oku, artır, yaz
    İki thread aynı anda girerse race condition oluşur
*/