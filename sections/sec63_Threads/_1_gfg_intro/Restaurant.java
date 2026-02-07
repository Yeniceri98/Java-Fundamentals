package sections.sec63_Threads._1_geekforgeeks_intro;

class ThreadImpl extends Thread {
    @Override
    public void run() {
        System.out.println("Thread Class Running...");
    }
}

class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Thread Running...");
    }
}

class CookingTask extends Thread {
    private String task;

    CookingTask(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " is being prepared by " + Thread.currentThread().getName());
    }
}

class CookingJob implements Runnable {
    private String job;

    CookingJob(String job) {
        this.job = job;
    }

    @Override
    public void run() {
        System.out.println(job + " is being prepared by " + Thread.currentThread().getName());
    }
}

public class Restaurant {
    public static void main(String[] args) {
        // Create and start Thread class thread
        ThreadImpl threadOne = new ThreadImpl();
        threadOne.start();

        // Create and start Runnable interface thread
        RunnableThread runnableThread = new RunnableThread();
        Thread threadTwo = new Thread(runnableThread);
        threadTwo.start();

        Thread t1 = new CookingTask("Pasta");
        Thread t2 = new CookingTask("Soup");
        Thread t3 = new CookingTask("Dessert");
        Thread t4 = new Thread(new CookingJob("Pizza"));
        Thread t5 = new Thread(new CookingJob("Cake"));

        t1.start();
        // t1.start();  NOTE: start() method cannot be called multiple times. It will throw IllegalStateException
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

/*
    A Java thread is the smallest unit of execution within a program
    It is a lightweight subprocess that runs independently but shares the same memory space as the process, allowing multiple tasks to execute concurrently

    We can create threads in java using two ways:
    1) by extending Thread
    2) by implementing Runnable

    run() Method:   Contains the code for the thread. Calling it directly behaves like a normal method call
    start() Method: Launches a new thread and internally calls run() concurrently
*/