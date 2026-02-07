package sections.sec26_Introduction_To_OOP;

import java.util.ArrayList;

public class MainPerson {
    public static void main(String[] args) {
        // Classes and Objects
        /*
            "Class" defines the attributes of objects, i.e., the information related to them (instance variables), and their commands, i.e., their methods
            The values of instance (i.e., object) variables define the internal state of an individual object, whereas methods define the functionality it offers
            "Method" is a piece of source code written inside a class that's been named and has the ability to be called
            A method is always part of some class and is often used to modify the internal state of an object instantiated from a class
            An object is always instantiated by calling a method that created an object, i.e., a "constructor" by using the "new" keyword
        */

        /*
            As an example, ArrayList is a class offered by Java, and we've made use of objects instantiated from it in our programs
            ArrayList  --->  Class
            integers  --->  Object
        */

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers.size());

        /*
            NOTE:
            Bu dosya içinde main'in hemen dışında class oluştururken "static" şeklinde oluşturmalıyız. Çünkü main() metodu sstatic
            Ana class'ın dışında yazarken direkt class ClassName şeklinde yazılabilir
        */
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Mary");
        student1.studentInfo();
        student2.studentInfo();


        // Static "Whistle" Class
        Whistle duckWhistle = new Whistle("VAK");
        duckWhistle.animalWhistle();


        // "Person" Class
        Person person1 = new Person("Ahmet");       // Constructor'da parametre olarak String initialName şeklinde aldıktan sonra this.name = initialName; ataması yaptığımız için burada String tipinde bir isim tanımlamalıyız
        Person person2 = new Person("Sami");        // Constructor'ın parametresinde "age" tanımlaması olmadığı için buraya age eklemeyiz. Constructor'ın içinde age değerini default olarak 10 aldığımızı belirttik
        Person person3 = new Person("Yeniçeri");

        person1.printPerson();      // Name: Ahmet, Age: 10
        person2.printPerson();
        person3.printPerson();

        person1.growOlder();
        person2.growOlder();

        person1.printPerson();      // Age 11
        person2.printPerson();      // Age 11
        person3.printPerson();      // Age 10 (Bu objeye growOlder metodu atanmadı

        System.out.println("\nFirst person's age: " + person1.returnAge());
        System.out.println("Second person's age: " + person2.returnAge());
        System.out.println("Third person's age: " + person3.returnAge());


        // "Person" Class Getters
        Person person4 = new Person("John");
        Person person5 = new Person("Alison");

        int i = 0;
        while (i < 30) {
            person4.growOlder();
            i++;
        }

        person5.growOlder();

        System.out.println();

        if (person4.isLegalAge()) {
            System.out.println(person4.getName() + " is of legal age which is " + person4.getAge());
        } else {
            System.out.println(person4.getName() + " is underage which is " + person4.getAge());
        }

        if (person5.isLegalAge()) {
            System.out.println(person5.getName() + " is of legal age which is " + person5.getAge());
        } else {
            System.out.println(person5.getName() + " is underage which is " + person5.getAge());
        }


        // toString()
        Person person6 = new Person("James");
        person6.toString();                // prints nothing
        System.out.println(person6);       // NOTE: person6.toString() şeklinde eklemeye gerek yok. Class'ta toString() tanımladıktan sonra bu şekilde bırakmak yeterli
    }

    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void studentInfo() {
            System.out.println("Id: " + this.id + ", Name: " + this.name);
        }
    }

    public static class Whistle {
        private String sound;

        public Whistle(String sound) {
            this.sound = sound;
        }

        public void animalWhistle() {
            System.out.println(sound);
        }
    }
}


