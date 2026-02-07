package sections.sec8a_Strings;

public class string_stringbuilder_stringbuffer {
    public static void main(String[] args) {
        // String
        String str = "Hello";
        str.concat("World");                            // NOTE: Yeni bir String nesnesi oluşturulmuş olmaz (immutable)
        System.out.println(str);                        // Hello
        str = str + " World";                           // NOTE: Yeni bir String nesnesi oluşturulur. Bu sayede değeri değiştirilebilir oldu
        System.out.println(str);                        // Hello World
        str = str.concat("Java");                       // NOTE: Bu şekilde de concat edebiliriz
        System.out.println(str);                        // Hello World Java

        // StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");                             // Aynı StringBuilder nesnesi değiştiriliyor
        System.out.println(sb);

        // StringBuffer
        StringBuffer sbuf = new StringBuffer("Hello");
        sbuf.append(" World");                          // Aynı StringBuffer nesnesi değiştiriliyor
        System.out.println(sbuf);

    }
}

/*
    String:
    - immutable'dır
    - str nesnesine "Hello" değeri atanmıştır
    - str nesnesine ekleme yapıldığında, yeni bir String nesnesi oluşturulur ve str değişkenine atanır

    StringBuilder:
    - immutable değildir
    - thread safe değildir. Bu sebeple StringBuffer'dan daha hızlı çalışır
    - sb nesnesine "Hello" değeri atanmıştır
    - sb üzerinde yapılan değişiklikler (ekleme işlemi) mevcut nesneyi değiştirir

    StringBuffer:
    - immutable değildir
    - thread safe'tir. Threadli ortamdalarda kullanılması önerilir
    - sbuf nesnesine "Hello" değeri atanmıştır
    - sbuf üzerinde yapılan değişiklikler (ekleme işlemi) mevcut nesneyi değiştirir.
*/