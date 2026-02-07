package sections.sec38_static_Keyword;

public class Main {
    static int number = 5;

    public static void printMessage() {
        System.out.println("Hello");
    }

    public static class Horse {
        private int horseCount = 0;
        private static int horseCountStatic = 0;

        static String printAnimal() {
            return "Horse";
        }

        int printAge() {
            return 15;
        }

        /*
            Instance metod içerisinde static olan ve olmayan değişkenlere doğrudan erişim sağlanabilir
            Çünkü static değişkenler bellekte tüm neseneler tarafından paylaşılan bir alanda tutulur
            Yani altta horseCountStatic de return edilebilir
        */
        public int getHorseCount() {
            return horseCount;
        }

        /*
            static metod içerisinde doğrudan yalnızca static değişkene erişilebilir
            static metod içerisinde instance variable'a erişilmek isteniyorsa önce obje oluşturulmalıdır
        */
        public static int getHorseCountStatic() {
            return horseCountStatic;
        }

        public void setHorseCount(int horseCount) {
            this.horseCount = horseCount;           // this kullanılır
        }

        public static void setHorseCountStatic(int horseCount) {
            Horse.horseCountStatic = horseCount;    // this kullanılamaz
        }
    }

    public static void main(String[] args) {
        // Statik değişken ve metodlara aşağıdaki gibi doğrudan erişilebilir
        System.out.println(number);
        printMessage();

        // Static class'a ait static metod (Direkt class üzerinden erişim sağlanabilir)
        System.out.println(Horse.printAnimal());

        // Static class'a ait instance metod (Obje oluşturulmalıdır)
        Horse horse = new Horse();
        System.out.println(horse.printAge());

        /*
            NOTE:
            static bir metod, bir nesne (instance) üzerinden çağrılabilir fakat bu önerilen bir yaklaşım değildir
            static metodlar sınıfa aittir, nesneye değil
            static metodlara her zaman sınıf adı üzerinden erişmek daha okunaklıdır ve gereksiz nesne oluşturmayı önler
        */
        horse.printAnimal();

        // Statik olmayan üyelere erişmek için obje oluşturulmalıdır
        Friend friend1 = new Friend("Peter");
        Friend friend2 = new Friend("Stewie");
        Friend friend3 = new Friend("Louis");

        System.out.println(Friend.numberOfFriends);     // NOTE: friend1.numberOfFriends şeklinde de yapabilirdik ama çok doğru bir kullanım olmazdı
        Friend.displayFriends();                        // Yine "Friend" class'ının metodu şeklinde kullandık (static olmazsa kullanılamaz)
    }
}

/*
    "static" tanımlamalara class üzerinden erişiriz
    public static void main(String[] args) metodu bir static context içinde çalışır
    Bu yüzden, sadece statik üyeler (static metotlar, static değişkenler, static iç sınıflar) doğrudan çağrılabilir
    static olmayan (instance) değişkenler ve metotlar, ancak bir nesne oluşturularak çağrılabilir
*/