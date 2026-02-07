package sections.sec65_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Get the Iterator
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println("Number: " + number);

            // Örnek olarak, çift sayıları silmek için remove() metodu kullanıyoruz
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("Numbers after removal: " + numbers); // [1, 3, 5]
    }
}

/*
    Java'da Iterator arayüzü, bir koleksiyon (List, Set, Map) üzerinde yinelemeyi (iterasyon) sağlamak için kullanılan bir arayüzdür
    Iterator arayüzü, java.util paketinde yer alır ve Java koleksiyonları üzerinde verileri adım adım döngüye sokmayı sağlar
    Koleksiyonlardaki elemanlara sırayla erişmek için bir mekanizma sunar

    Iterator'ün başlıca metotları hasNext(), next() ve remove()'dur:

    hasNext():
    - Koleksiyon üzerinde ilerlerken daha fazla eleman olup olmadığını kontrol eder
    - Eğer başka eleman varsa true, yoksa false döndürür

    next():
    - Koleksiyondaki bir sonraki elemanı döndürür
    - hasNext() metodu true döndürdüğünde kullanılır

    remove():
   -  Koleksiyondaki son dönülen elemanı siler
    - Bu metodu kullanmak dikkatli olmayı gerektirir, çünkü desteklenmeyen koleksiyonlarda çalıştırılırsa UnsupportedOperationException atabilir.
*/