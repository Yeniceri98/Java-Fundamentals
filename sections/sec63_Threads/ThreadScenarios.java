package sections.sec63_Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ThreadExamples {

    static void startVsRunDemo() throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("[Child] Running on: " + Thread.currentThread().getName());
        }, "child-1");

        System.out.println("[Main] Before start: " + t.getState()); // NEW

        // start(): new thread
        t.start();
        System.out.println("[Main] After start: " + t.getState());  // RUNNABLE (timing'e bağlı)
        t.join();

        // run(): normal method call (no new thread)
        Thread t2 = new Thread(() -> {
            System.out.println("[Run call] Running on: " + Thread.currentThread().getName());
        }, "child-2");

        t2.run(); // runs on main thread
    }

    static void sleepVsWaitDemo() throws InterruptedException {
        Object monitor = new Object();

        Thread sleeper = new Thread(() -> {
            synchronized (monitor) {
                try {
                    System.out.println("[Sleeper] Holding lock, going to sleep...");
                    Thread.sleep(500); // DOES NOT release monitor
                    System.out.println("[Sleeper] Woke up, still holding lock.");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "sleeper");

        Thread waiter = new Thread(() -> {
            synchronized (monitor) {
                try {
                    System.out.println("[Waiter] Calling wait(), releases lock and waits...");
                    monitor.wait(800); // releases monitor, TIMED_WAITING
                    System.out.println("[Waiter] Woke up (timeout or notify), reacquired lock.");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "waiter");

        sleeper.start();
        Thread.sleep(50); // ensure sleeper takes lock first
        waiter.start();

        sleeper.join();
        waiter.join();
    }

    static void daemonAndPriorityDemo() throws InterruptedException {
        Thread daemon = new Thread(() -> {
            while (true) {
                // Simulate background work
                try {
                    Thread.sleep(200);
                    System.out.println("[Daemon] Still running...");
                } catch (InterruptedException e) {
                    return;
                }
            }
        }, "daemon-worker");

        daemon.setDaemon(true); // must be before start
        daemon.setPriority(Thread.MIN_PRIORITY); // scheduler hint

        Thread userThread = new Thread(() -> {
            try {
                Thread.sleep(600);
                System.out.println("[User] Done.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "user-thread");

        userThread.setPriority(Thread.NORM_PRIORITY);

        daemon.start();
        userThread.start();

        userThread.join();
        System.out.println("[Main] Only daemon may remain, JVM can exit now.");
    }

    static void threadStatesDemo() throws InterruptedException {
        Object monitor = new Object();

        Thread t = new Thread(() -> {
            synchronized (monitor) {
                try {
                    Thread.sleep(300); // TIMED_WAITING
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "state-demo");

        System.out.println("[State] NEW: " + t.getState()); // NEW
        t.start();

        Thread.sleep(50);
        System.out.println("[State] After start: " + t.getState()); // RUNNABLE or TIMED_WAITING (timing)

        // Create a BLOCKED scenario
        Thread blocker1 = new Thread(() -> {
            synchronized (monitor) {
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "blocker-1");

        Thread blocker2 = new Thread(() -> {
            synchronized (monitor) {
                System.out.println("[blocker-2] acquired lock");
            }
        }, "blocker-2");

        blocker1.start();
        Thread.sleep(30); // let blocker1 acquire monitor
        blocker2.start();

        Thread.sleep(30);
        System.out.println("[State] blocker-2 likely BLOCKED: " + blocker2.getState()); // BLOCKED (timing)

        blocker1.join();
        blocker2.join();
        t.join();

        System.out.println("[State] TERMINATED: " + t.getState()); // TERMINATED
    }
}

class ConcurrencyTools {

    private int syncCounter = 0;
    private final Lock lock = new ReentrantLock();

    private volatile boolean running = true; // visibility flag

    void synchronizedDemo() throws InterruptedException {
        Thread t1 = new Thread(this::syncIncrementLoop, "sync-1");
        Thread t2 = new Thread(this::syncIncrementLoop, "sync-2");

        t1.start();
        t2.start();

        Thread.sleep(300);
        running = false;

        t1.join();
        t2.join();

        System.out.println("[synchronized] counter = " + syncCounter);
    }

    private void syncIncrementLoop() {
        while (running) {
            incrementSynchronized();
        }
    }

    private synchronized void incrementSynchronized() {
        syncCounter++;
    }

    void lockDemo() throws InterruptedException {
        running = true;
        syncCounter = 0;

        Thread t1 = new Thread(this::lockIncrementLoop, "lock-1");
        Thread t2 = new Thread(this::lockIncrementLoop, "lock-2");

        t1.start();
        t2.start();

        Thread.sleep(300);
        running = false;

        t1.join();
        t2.join();

        System.out.println("[lock] counter = " + syncCounter);
    }

    private void lockIncrementLoop() {
        while (running) {
            lock.lock();
            try {
                syncCounter++;
            } finally {
                lock.unlock();
            }
        }
    }
}

class ExecutorsDemo {

    static void threadPoolDemo() throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(4);

        Callable<Integer> task = () -> {
            Thread.sleep(200);
            return 42;
        };

        Future<Integer> future = pool.submit(task);
        System.out.println("[pool] Result = " + future.get());

        List<Callable<String>> tasks = new ArrayList<>();
        tasks.add(() -> "A-" + Thread.currentThread().getName());
        tasks.add(() -> "B-" + Thread.currentThread().getName());
        tasks.add(() -> "C-" + Thread.currentThread().getName());

        List<Future<String>> futures = pool.invokeAll(tasks);
        for (Future<String> f : futures) {
            System.out.println("[pool] " + f.get());
        }

        pool.shutdown();
        pool.awaitTermination(2, TimeUnit.SECONDS);
    }

    static void scheduledExecutorDemo() throws InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        ScheduledFuture<?> handle = scheduler.scheduleAtFixedRate(
                () -> System.out.println("[scheduled] tick on " + Thread.currentThread().getName()),
                0,
                200,
                TimeUnit.MILLISECONDS
        );

        Thread.sleep(650);
        handle.cancel(true);

        scheduler.shutdown();
        scheduler.awaitTermination(1, TimeUnit.SECONDS);
    }

    static void virtualThreadDemo() throws Exception {
        // Requires Java 21+
        try (ExecutorService vExecutor = Executors.newVirtualThreadPerTaskExecutor()) {
            List<Callable<String>> tasks = new ArrayList<>();

            for (int i = 0; i < 5; i++) {
                int id = i;
                tasks.add(() -> {
                    Thread.sleep(200); // simulate blocking I/O
                    return "VTask-" + id + " on " + Thread.currentThread();
                });
            }

            List<Future<String>> futures = vExecutor.invokeAll(tasks);
            for (Future<String> f : futures) {
                System.out.println("[virtual] " + f.get());
            }
        }
    }
}

public class ThreadScenarios {

    public static void main(String[] args) throws Exception {
        System.out.println("Main thread: " + Thread.currentThread().getName());

        ThreadExamples.startVsRunDemo();
        ThreadExamples.sleepVsWaitDemo();
        ThreadExamples.daemonAndPriorityDemo();
        ThreadExamples.threadStatesDemo();

        ConcurrencyTools tools = new ConcurrencyTools();
        tools.synchronizedDemo();
        tools.lockDemo();

        ExecutorsDemo.threadPoolDemo();
        ExecutorsDemo.scheduledExecutorDemo();
        ExecutorsDemo.virtualThreadDemo();      // Java 21+
    }
}
