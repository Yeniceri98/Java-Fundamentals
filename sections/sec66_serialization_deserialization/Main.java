package sections.sec66_serialization_deserialization;

import java.io.*;

public class Main {
    // Serializable arayüzünü uygulayan bir sınıf
    public static class Person implements Serializable {
        private String name;
        private transient int age;      // Transient olarak işaretlenmiş alan. age değeri serialize edilmeyecek. deserialization sırasında default değeri olan 0'ı alacak

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    public static void main(String[] args) {

        // Seri hale getirilecek bir Person nesnesi
        Person person = new Person("Alice", 30);

        try {

            // Serialization
            FileOutputStream fileOut = new FileOutputStream("person.ser");      // Serileştirilecek olan nesnenin yazılacağı dosya
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);   // Nesneyi serileştiriyoruz
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in person.ser");

            // Deserialization
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person deserializedPerson = (Person) in.readObject();   // Nesneyi deserialleştiriyoruz
            in.close();
            fileIn.close();

            // Deserialized nesneyi kontrol ediyoruz
            System.out.println("Deserialized Person: " + deserializedPerson);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/*
    KOD AÇIKLAMASI
    - Person sınıfı Serializable arayüzünü uygulayarak seri hale getirilebilir olduğunu belirtir
    - ObjectOutputStream kullanarak Person nesnesi serileştirilir ve person.ser dosyasına yazılır
    - ObjectInputStream kullanarak person.ser dosyasından nesne deserialleştirilir ve Person nesnesi olarak yeniden oluşturulur
    - Sonuç olarak, serileştirilmiş ve deserialleştirilmiş nesne ekrana yazdırılır

    SERIALIZATION & DESERIZALITON
    - Java ile yazılan kodlar, data türleri ile birlikte, binary koda çevrilir
    - Bu kodlar arasında her değerin hangi data türüne sahip olduğu gibi bilgiler yer alır
    - Fakat oluşturduğumuz verileri Java dışına, örneğin hard disk gibi bir ortama aktardığımızda yalnızca verilerin aktarılmış olmasını sağlarız
    - Yani hangi verinin hangi data türüne sahip olduğu gibi bilgiler karşı tarafa gitmez
    - Bu sebeple bu verileri Java ortamına geri çağırdığımızda, sistem hangi verinin hangi veri türüne sahip olduğunu bilemez ve bu yüzden onları çalıştıramaz
    - Bu problemin önüne geçmek için, veriler dışarıya aktarılırken, onların hangi türde olduklarını da beraberinde gönderen bir yapı oluşturulmuştur. Bu yapı "Serialization" yapısıdır
    - Serialization ile birlikte örneğin 5 sayısını dışarı aktardığınızda, yanında bu değerin Integer veri tipine sahip olduğu bilgisi de gider

    - Serialization işlemi ile bu verilerin geri çağırılması ve Java diline uygun bir yapıya çevirilmesi işlemine ise "Deserialization" işlemi denir

    - Serialization ve deserialization, nesneleri farklı formatlar arasında dönüştürmek için kullanılır
    - Serialization, nesneleri bir veri akışına veya dosyaya dönüştürerek saklamak veya iletmek için kullanılır
    - Deserialization, bir veri akışından veya dosyadan serileştirilmiş nesneleri yeniden oluşturarak kullanmak için kullanılır
    - Bu işlemler, nesneleri kaydetmek, iletmek ve paylaşmak için kullanılır

    - Person sınıfındaki "age" alanı "transient" olarak işaretlenmiştir. Bu nedenle nesne serileştirildiğinde age alanı kaydedilmez
    - person.ser dosyasından deserialleştirilen Person nesnesinin age alanı varsayılan değer olan 0 olarak döndürülür

    Transient:
    - "transient" anahtar kelimesi, bir sınıfın bir alanının serileştirilmeyeceğini belirtir
    - transient, gizli veya hassas verileri serileştirmekten kaçınmak için kullanılabilir
    - transient olarak işaretlenen alanlar, nesne serileştirilirken göz ardı edilir
    - transient olarak işaretlenmiş bir alan serileştirilmediği için, deserializasyon sırasında bu alana varsayılan bir değer atanır
    - Örneğin, int türündeki bir transient alan deserializasyon sırasında 0 değerine sahip olur
*/