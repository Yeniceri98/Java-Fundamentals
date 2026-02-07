package sections.sec51_Interface;

interface Logger {
    // Java 9 ile birlikte default metodlar ortak private metodları çağırabilir
    default void info(String msg) {
        log("INFO", msg);
    }

    default void error(String msg) {
        log("ERROR", msg);
    }

    // this method cannot be override or called by other class since it's private
    private void log(String level, String msg) {
        System.out.println(level + ": " + msg);
    }

    // abstract method (must be override)
    void run();
}

public class InterfaceWithDefaultAndPrivate implements Logger {
    @Override
    public void run() {
        System.out.println("Overriding abstract run method");
    }

    public static void main(String[] args) {
        InterfaceWithDefaultAndPrivate i = new InterfaceWithDefaultAndPrivate();
        i.run();
        i.info("info");
        i.error("error");
    }
}
