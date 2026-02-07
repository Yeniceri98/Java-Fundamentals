package sections.sec27_Objects_and_References;

public class Main {
    public static void main(String[] args) {
        // "Person" Class
        Person person = new Person("Ahmet");
        System.out.println(person);     // NOTE: toString() metodu sayesinde bu şekilde yazdırabiliyoruz. person.toString() ile aynı işlevi görür


        // Assigning a reference type variable copies the reference
        Person firstPerson = new Person("Damian");
        System.out.println(firstPerson);        // Returns age 0

        /*
            firstPerson referansı secondPerson'ın referansına kopyalandı
            Her 2 referans da aynı nesneyi işaret etmiş olur
            Birinde yapılan değişiklik diğerini de etkiler
        */
        Person secondPerson = firstPerson;
        secondPerson.growOlder();
        secondPerson.growOlder();
        secondPerson.growOlder();

        System.out.println(firstPerson);        // Returns 3
        System.out.println(secondPerson);       // Returns 3


        // Example 2:
        Person ahmet = new Person("Ahmet");
        System.out.println(ahmet);          // Returns 0

        Person sami = ahmet;
        sami.growOlder();
        sami.growOlder();

        System.out.println(ahmet);          // Returns 2

        ahmet = new Person("Ahmet");
        System.out.println(ahmet);          // Returns 0

        sami = null;
        System.out.println(sami);           // Returns null
        sami.growOlder();                   // Error


        // Object as a Method Parameter
        Person person1 = new Person("Matt");
        person1.setWeight(85);
        person1.setHeight(170);

        Person person2 = new Person("Josh");
        person2.setWeight(90);
        person2.setHeight(195);

        AmusementParkRide waterTrack = new AmusementParkRide("Water track", 160);

        if (waterTrack.allowedToRide(person1)) {
            System.out.println(person1.getName() + " can enter the ride. His height is " + person1.getHeight());
        } else {
            System.out.println(person1.getName() + " can not enter the ride! His height is " + person1.getHeight());
        }

        if (waterTrack.allowedToRide(person2)) {
            System.out.println(person2.getName() + " can enter the ride. His height is " + person2.getHeight());
        } else {
            System.out.println(person2.getName() + " can not enter the ride! His height is " + person2.getHeight());
        }

        System.out.println(waterTrack);




        // ___ Object as Object Variable ___
        // Objects may contain references to objects.
        // NOTE: "Person2" class'ı içinde "SimpleDate" class'ı kullanıldı
        SimpleDate date = new SimpleDate(6, 5, 1998);
        Person2 carl = new Person2("Carl", date);               // Constructor 1
        Person2 kevin = new Person2("Kevin", 19, 6, 1985);      // Constructor 2

        System.out.println();
        System.out.println(carl);
        System.out.println(kevin);



//        // ___ Object of same type as method parameter ___
//        // "SimpleDate" Class
//        SimpleDate d1 = new SimpleDate(14, 2, 2011);
//        SimpleDate d2 = new SimpleDate(21, 2, 2011);
//        SimpleDate d3 = new SimpleDate(1, 3, 2011);
//        SimpleDate d4 = new SimpleDate(31, 12, 2010);
//
//        System.out.println(d1 + " is earlier than " + d2 + ": " + d1.before(d2));
//        System.out.println(d2 + " is earlier than " + d1 + ": " + d2.before(d1));
//
//        System.out.println(d2 + " is earlier than " + d3 + ": " + d2.before(d3));
//        System.out.println(d3 + " is earlier than " + d2 + ": " + d3.before(d2));
//
//        System.out.println(d4 + " is earlier than " + d1 + ": " + d4.before(d1));
//        System.out.println(d1 + " is earlier than " + d4 + ": " + d1.before(d4));


//        // "Person2" Class
//        Person2 first = new Person2("George", 15, 10, 2010);
//        Person2 second = new Person2("Kevin", 15, 10, 1995);
//        System.out.println(first.getName() + " is older than " + second.getName() + " ? " + first.olderThan(second));
//        System.out.println();


        // Example: "Apartment" Class:
        Apartment apt1 = new Apartment("First apartment", 1, 16, 5000);
        Apartment apt2 = new Apartment("Second apartment", 2, 38, 4000);
        Apartment apt3 = new Apartment("Third apartment", 4, 52, 8000);

        System.out.println("Is " + apt1.getAptName() + " more expensive than " + apt2.getAptName() + "? " + apt1.moreExpensiveThan(apt2));
        System.out.println("Is " + apt2.getAptName() + " more expensive than " + apt3.getAptName() + "? " + apt2.moreExpensiveThan(apt3));
        System.out.println();

        System.out.println("Is " + apt1.getAptName() + " larger than " + apt3.getAptName() + "? " + apt1.largerThan(apt3));
        System.out.println();

        System.out.println("Price difference between " + apt1.getAptName() + " and " + apt2.getAptName() + " = " + apt1.priceDifference(apt2));
        System.out.println();


    }
}
