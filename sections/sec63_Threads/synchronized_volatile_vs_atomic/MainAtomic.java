package sections.sec63_Threads.synchronized_volatile_vs_atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainAtomic {
    public static void main(String[] args) {
        final UnsafeClassAtomic myClass = new UnsafeClassAtomic();
        final int numOfThreads = 5;
        final int numOfIterations = 10_000;

        try (final ExecutorService executorService = Executors.newFixedThreadPool(numOfThreads)) {
            for (int i = 0; i < numOfThreads; i++) {
                executorService.submit(() -> {
                    for (int j = 0; j < numOfIterations; j++) {
                        myClass.increment();
                    }
                });
            }
        }
        System.out.println(myClass.getCounter());
    }
}
