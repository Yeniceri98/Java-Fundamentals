package sections.sec63_Threads._3_geekforgeeks_main_and_daemon_thread_priority_states;

public class MainThread extends Thread {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        System.out.println("Main Thread State: " + thread.getState());  // RUNNABLE

        // Getting name of Main thread
        System.out.println("Current thread: " + thread.getName());  // main

        // Changing the name of Main thread
        thread.setName("Geeks");
        System.out.println("After name change: " + thread.getName());   // Geeks

        // Getting priority of Main thread
        System.out.println("Main thread priority: " + thread.getPriority());    // 5 (default)

        // Setting priority of Main thread
        thread.setPriority(MAX_PRIORITY);
        System.out.println("Main thread new priority: " + thread.getPriority());    // 10

        // Main thread creating a child thread with lambda
        Thread childThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child thread");
            }
        });

        System.out.println("Child thread priority: " + childThread.getPriority());  // 10

        System.out.println("Child Thread State - Before Start: " + childThread.getState());  // NEW
        childThread.start();
        System.out.println("Child Thread State - After Start: " + childThread.getState());   // RUNNABLE
    }
}

class ChildThread extends Thread {
    @Override public void run() {
        for (int i = 0; i < 5; i++) {

            // Print statement whenever child thread is  called
            System.out.println("Child thread...");
        }
    }
}

/*
    Main thread, JVM başladığında otomatik olarak oluşturulan ilk thread’dir
    public static void main(String[] args) metodunu çalıştırır
    User thread’dir (daemon değildir)
    JVM’in yaşam döngüsünü başlatır

    For each program, a Main thread is created by JVM (Java Virtual Machine)
    The "Main" thread first verifies the existence of the main() method, and then it initializes the class.
    The main thread is created automatically when our program is started
    To control it we must obtain a reference to it
    This can be done by calling the method currentThread() which is present in Thread class
    This method returns a reference to the thread on which it is called
    The default priority of Main thread is 5 and for all remaining user threads priority will be inherited from parent to child

    Each thread has a priority between 1 and 10, which indicates its importance
    Threads with higher priority are generally preferred by the scheduler, though execution order is not guaranteed
    - Thread.MIN_PRIORITY (1):    Lowest possible priority for a thread
    - Thread.NORM_PRIORITY (5):   Default priority assigned to a thread
    - Thread.MAX_PRIORITY (10):   Highest possible priority for a thread

    THREAD STATES
    - NEW:           Thread oluşturulmuş ama start edilmemiştir
    - RUNNABLE:      Thread çalışmaya hazır veya çalışıyor. JVM açısından CPU'da çalışıyor olabilir veya scheduler sırasındadır
    - BLOCKED:       Thread, bir monitor lock'u bekliyordur. synchronized blokta başka bir thread lock'u tutuyorsa oluşur
    - WAITING:       Thread, süresiz olarak başka bir thread'den sinyal bekler. Kendiliğinden uyanmaz. Uyanması için notify(), notifyAll(), join() tamamlanması beklenir
    - TIMED_WAITING: Thread, belirli bir süre bekler. Süre dolunca otomatik uyanır. sleep(), wait(), join()
    - TERMINATED:    Thread işi bitirmiştir. Bir daha çalıştırılamaz
*/