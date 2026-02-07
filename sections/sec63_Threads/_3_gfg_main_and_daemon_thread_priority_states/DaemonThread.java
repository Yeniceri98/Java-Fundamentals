package sections.sec63_Threads._3_geekforgeeks_main_and_daemon_thread_priority_states;

public class DaemonThread extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is running...");
        } else {
            System.out.println("User thread is running...");
        }
    }

    public static void main(String[] args) {
        DaemonThread daemonThread1 = new DaemonThread();
        DaemonThread daemonThread2 = new DaemonThread();

        daemonThread1.setDaemon(true);

        daemonThread1.start();
        daemonThread2.start();
    }
}

/*
    Arka plan thread’idir
    JVM, daemon thread’leri beklemez. User thread’ler bitince JVM kapanır. main bittiği anda JVM kapanır
    start() öncesi mutlaka set edilmelidir. Eğer sonrasında set edilirse IllegalThreadStateException hatasını fırlatır

    Kullanım alanları
    - Garbage Collector: The Garbage Collector (GC) in Java runs as a daemon thread
    - Background monitoring
    - Heartbeat
    - Cache cleaner
*/
