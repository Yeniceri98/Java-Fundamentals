package sections.sec63_Threads;

public class Lambda {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running by using lambda");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println("Lambda thread is finished");
        });

        thread.start();
    }
}

/*
    Java'da thread oluşturmanın iki ana yolu vardır:
    1) Thread sınıfını genişleterek
    2) Runnable arayüzünü uygulayarak

    - "Thread" sınıfını genişleterek thread oluşturma genellikle önerilmez, çünkü Java'da çoklu miras mümkün değildir ve Thread sınıfını genişletmek başka bir sınıfı genişletme özgürlüğünü kısıtlar
    - "Runnable" arayüzünü uygulayarak thread oluşturma ise daha esnek bir yaklaşım olarak kabul edilir
    - Ancak, son yıllarda lambda ifadeleri ve anonim sınıflar sayesinde Runnable arayüzü daha pratik bir şekilde kullanılabiliyor
    - Lambda ifadesi, Runnable arayüzünde yer alan run() metodunun içeriğini tanımlamanın daha kısa ve pratik bir yoludur

    NOTE: Thread classına gidersek Runnable'ı implemente ettiğini görebiliriz
*/