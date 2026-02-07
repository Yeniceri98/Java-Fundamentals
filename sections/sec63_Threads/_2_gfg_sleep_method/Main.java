package sections.sec63_Threads._2_geekforgeeks_sleep_method;

class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(i + "");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);     // 1 sec
                System.out.println(i + "");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // Custom Thread
        MyThread thread = new MyThread();
        thread.start();
    }
}

/*
    Thread.sleep() pauses the current thread's execution
    Throws InterruptedException if another thread interrupts during sleep
    Actual sleep duration may vary based on system load; higher load increases sleep time
    We can use Thread.sleep() method for any thread, i.e., we can do it with the main thread or any other thread that we make programmatically
*/