package sections.sec63_Threads.thread_runnable;

public class AnotherMultithreadThing implements Runnable {
    private int threadNumber;

    public AnotherMultithreadThing(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
