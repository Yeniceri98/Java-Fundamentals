package sections.sec8b_Strings_BufferedReader_InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name: ");
            String name = reader.readLine();    // Satır okur
            System.out.println("Hello " + name);
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
    BufferedReader, veriyi satır satır okuma konusunda oldukça hızlı ve verimli bir yapıdır
    InputStreamReader, byte stream'i character stream'e çevirir ve genellikle System.in ile birlikte kullanılır

                            BufferedReader	                                                    Scanner
    Performans:	            Daha hızlı ve verimli çalışır                                       Daha yavaş, ancak kullanımı daha kolay
    Veri Türü Desteği:	    Sadece String okur, dönüşüm yapmak gerekir (Integer.parseInt())	    Farklı veri türlerini doğrudan okuyabilir (nextInt(), nextDouble(), vb.)
    Kullanım Kolaylığı:	    readLine() metodu ile tam satır okur	                            Kelime kelime veya satır satır okuma yapılabilir
    Veri Okuma Şekli:	    Sadece satır bazlı okuma yapar                                      Kelime kelime veya satır satır okuma yapabilir
    Buffer Kullanımı:	    Büyük boyutlu verileri daha hızlı işler                             Buffer kullanmaz, satır satır işler
    Exception Handling:	    IOException fırlatır, try-catch gerektirir                          IOException fırlatmaz, daha rahat kullanılır

    Scanner Kullanımı (Küçük Veri, Kolay Kullanım İçin)
    - Küçük boyutlu girişlerde ve birden fazla veri türüyle işlem yaparken (int, double, vs.)
    - Kullanım kolaylığı açısından, hızlı ve basit girişlerde Scanner daha iyidir
    - Örnek: Kullanıcıdan yaş, maaş gibi sayısal değerleri almak

    BufferedReader Kullanımı (Büyük Veri, Yüksek Performans İçin)
    - Büyük boyutlu metin dosyalarını okurken veya System.in ile performans kritik uygulamalarda
    - Daha hızlı ve buffer kullanarak çalıştığı için verimli bir alternatiftir
    - Örnek: Dosya okuma işlemlerinde veya büyük JSON, XML gibi metin tabanlı veri işlemlerinde
*/