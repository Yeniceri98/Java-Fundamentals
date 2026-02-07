package sections.sec63_Threads.synchronized_volatile_vs_atomic;

public class UnsafeClassVolatile {
    // private boolean done = false;
    /*
        NOTE:
        volatile keyword'ü olmayınca alttaki gibi görünüyordu ve askıda kalıyordu. waitToFinish() exiting kısmına geçemiyordu
        Entering loop method
        waitToFinish() entering
        Setting 'done' variable to 'true'

    */
    private volatile boolean done = false;

    public void loop() throws InterruptedException {
        System.out.println("Entering loop method");

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
        }

        System.out.println("Setting 'done' variable to 'true'");
        done = true;
    }

    public void waitToFinish() {
        System.out.println("waitToFinish() entering");
        while (!done);
        System.out.println("waitToFinish() exiting");
    }
}
