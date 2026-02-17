package sections.sec19_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Vector_vs_ArrayList {

    public static void main(String[] args) throws InterruptedException {
        int size = 100000;

        // ArrayList
        List<Integer> arrayList = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("It took " + (end-start) + "ms in ArrayList");

        // Vector
        List<Integer> vector = new Vector<>();

        start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            vector.add(i);
        }

        end = System.currentTimeMillis();

        System.out.println("It took " + (end-start) + "ms in Vector");


        // IN MULTI-THREAD SITUATION

        List<Integer> multithreadArrayList = new ArrayList<>();

        start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multithreadArrayList.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multithreadArrayList.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();      // join() metodu, ilgili thread'in tamamlanmasını bekler ve sadece o zaman devam eder
        t2.join();

        end = System.currentTimeMillis();

        System.out.println("It took " + (end-start) + "ms in ArrayList - multi-thread");
        System.out.println("ArrayList size in multi-threaded situation: " + multithreadArrayList.size());

        List<Integer> multithreadVector = new Vector<>();

        start = System.currentTimeMillis();

        t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multithreadVector.add(i);
            }
        });

        t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multithreadVector.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        end = System.currentTimeMillis();

        System.out.println("It took " + (end-start) + "ms in Vector - multi-thread");
        System.out.println("Vector size in multi-threaded situation: " + multithreadVector.size());

        // NOTE: ArrayList'in multithread ortamda düzgün çalışması için alttaki gibi tanımlamalıyız:

        List<Integer> multithreadArrayListThreadSafe = Collections.synchronizedList(new ArrayList<>());

        start = System.currentTimeMillis();

        t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multithreadArrayListThreadSafe.add(i);
            }
        });

        t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multithreadArrayListThreadSafe.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        end = System.currentTimeMillis();

        System.out.println("It took " + (end-start) + "ms in ArrayList - multi-thread");
        System.out.println("ArrayList size in multi-threaded situation: " + multithreadArrayListThreadSafe.size());


    }
}

/*
    Normal ortamda ArrayList Vector'den daha hızlıdır

    ArrayList is NOT thread-safe and sync, Vector is thread-safe
    Multithread ortamında Vector daha iyi bir tercihtir
    Örneğin size'ları bastırdığımızda ArrayList'te bazen hata alıyor, bazen de tüm elemanların listeye eklenemediğini görüyoruz
    Vector her seferinde doğru sayıda elemanı listesine ekleyebilmiş

    ArrayList'i Collections.synchronizedList(new ArrayList<>() şeklinde tanımlarsa thread-safe yapmış oluruz

    Genel olarak ArrayList önerilen yöntemdir (single threadlerde özellikle)
*/