package sections.sec38_static_Keyword;

public class StaticVsInstance {
    static int num1 = 0;
    int num2 = 0;

    public StaticVsInstance() {
        num1++;
        num2++;
    }

    public static void main(String[] args) {
        StaticVsInstance object1 = new StaticVsInstance();
        System.out.println("Object 1 - Static: " + StaticVsInstance.num1);  // 1
        System.out.println("Object 1 - Instance: " + object1.num2);         // 1

        StaticVsInstance object2 = new StaticVsInstance();
        System.out.println("Object 2 - Static: " + StaticVsInstance.num1);  // 2
        System.out.println("Object 2 - Instance: " + object2.num2);         // 1
    }
}

/*
    STATIC vs INSTANCE

    "static" değişkenler, sınıfın tüm örneklerinde (instance'larında) ortak olan değişkenlerdir
    static değişkenler, sınıf seviyesinde tanımlanır ve bir sınıfın tüm örnekleri için ortak bir değer taşırlar
    static değişkenler, bir sınıfın bellekte yalnızca bir kez oluşturulurlar ve sınıfın tüm örnekleri bu değişkeni paylaşır

    "Instance" değişkenler, sınıfın her örneği (instance'ı) için ayrı ayrı tanımlanırlar
    Her bir sınıf örneği için ayrı bir bellek alanında saklanırlar ve her örneğin kendi değişken kopyası vardır
    Instance değişkenlere, yalnızca sınıfın örneği üzerinden erişilebilir.
*/
