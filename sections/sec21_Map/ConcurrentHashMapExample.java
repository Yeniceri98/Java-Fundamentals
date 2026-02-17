package sections.sec21_Map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> requestCounts = new ConcurrentHashMap<>();

        Runnable task = () -> {
            for (int i = 0; i < 100_000; i++) {
                requestCounts.merge("/orders", 1, Integer::sum);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(requestCounts.get("/orders"));
    }
}

/*
    ConcurrentHashMap, concurrent kullanım için tasarlanmıştır:
    - Thread-safe
    - Yüksek concurrency için optimize
    - Okuma ağırlıklı sistemlerde çok iyi ölçeklenir
    - Modern implementasyonda “tek global lock” yerine fine-grained locking / CAS yaklaşımı kullanır.

    HashMap vs ConcurrentHashMap:
    HashMap:
    - null key kabul eder (1 adet)
    - null value kabul eder

    ConcurrentHashMap
    - null key kabul etmez
    - null value kabul etmez
*/