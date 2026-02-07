package sections.sec98_AlgorithmPatterns;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TopKElements {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 12, 9, 7, 4};

        // Finding Top K Elements with Sorting
        System.out.println("Sorting: " + Arrays.toString(findTopKWithSorting(arr, 3)));

        // Finding Top K Elements with MinHeap (Best Approach)
        System.out.println("Min Heap: " + Arrays.toString(findTopKWithMinHeap(arr, 3)));
    }

    public static int[] findTopKWithSorting(int[] arr, int k) {
        Arrays.sort(arr);           // O(N log N)

        int[] result = new int[k];  // k elemanlı yani 3 elemanlı bir array
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            result[i] = arr[n - k + i];     // Top K element
            /*
                array'in boyutu n = 7
                k kadar eleman olacağı için o kısım n'den çıkartıldı (sort edilmişti öncesinde)
                her seferinde 1'er 1'er ilermesi için i'yi de ekledik
            */
        }

        return result;
    }

    public static int[] findTopKWithMinHeap(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);     // Heap'e elemanlar "küçükten büyüğe" olacak şekilde ekleniyor

            if (minHeap.size() > k) {
                minHeap.poll();     // İlk yani en küçük eleman size 3'e düşene kadar çıkartılıyor
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}

/*
    Top K Elements (En Büyük veya En Küçük K Elemanı Bulma) algoritması, bir dizi veya veri kümesi içinde en büyük veya en küçük K elemanı verimli bir şekilde bulmaya odaklanır

    Ne Zaman Kullanılır?
    - En büyük K elemanı bulma. Örneğin: En yüksek maaş alan 5 çalışanı bulma
    - En küçük K elemanı bulma. Örneğin: En ucuz 3 ürünü listeleme
    - En sık tekrar eden K elemanı bulma. Örneğin: Bir metinde en sık geçen 10 kelimeyi bulma
    - Akış (Stream) verisinde en büyük / en küçük elemanları bulma

    Yöntemler:

    a) Sorting (Sıralama) -> O(N log N)
    - Diziyi sıralayıp ilk K elemanı almak
    - Büyük veri setlerinde yavaş olabilir

    b) Heap (MinHeap / MaxHeap) -> O(N log K)
    - Min Heap (K en büyük elemanı bulmak için)
    - Max Heap (K en küçük elemanı bulmak için)
    - Büyük verilerde daha verimli
    - Java'da PriorityQueue ile kullanılır
    - PriorityQueue'da elemanlar default olarak küçükten büyüğe sıralanır

    c) QuickSelect (Hoare's Selection) -> O(N) Ortalama
    - Partitioning kullanarak doğrudan K elemanı bulma
    - En iyi performans, ancak ortalama O(N), en kötü durumda O(N²)
*/