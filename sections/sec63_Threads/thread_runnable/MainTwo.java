package sections.sec63_Threads.thread_runnable;

public class MainTwo {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            MultithreadThing myThing = new MultithreadThing(i);
            myThing.start();
        }
    }
}

/*
    Thread'li yapılarda thread'lerin sırası belli değildir. İlk önce 3. thread sonra 5. thread sonra 1. thread çalışabilir
    Eğer bir thread patlarsa diğer thread'ler bundan etkilenmez
*/