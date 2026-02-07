package sections.sec48_AbstractClass;

public abstract class AbstractDatabase {         // "abstract" yazılmalıdır
    public void add() {
        System.out.println("Added");
    }

    public void delete() {
        System.out.println("Deleted");
    }

    abstract void update();

    abstract void get();
}


/*
    Abstract classlar'da gövdeli ve gövdesiz metod tanımlaması beraber yapılabilir
    Yukarıdaki örnekte add() ve delete() metodları tüm classlar için ortak olacakken; get() ve update() metodları farklı olacak.
    Bu yüzden get() ve update() metodlarını abstract şeklinde gövdesiz olarak yazdık ve bu metodları kullanacağımız classlarda custom bir şekilde tanımladık

    Interface'den farkı:
    Abstract class extends edilirken; interface'ler implements edilir
    Bu işlemi interface ile yapsaydık ortak olan add() ve delete() metodlarını da kullanacağımız classlarda tanımlamamız gerekecekti
    Kod fazlalığından kurtulmuş olduk
*/
