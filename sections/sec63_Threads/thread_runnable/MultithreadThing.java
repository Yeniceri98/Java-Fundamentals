package sections.sec63_Threads.thread_runnable;

public class MultithreadThing extends Thread {
    private int threadNumber;

    public MultithreadThing() {

    }

    public MultithreadThing(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
