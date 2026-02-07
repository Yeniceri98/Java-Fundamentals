package sections.sec44_Inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // "Part" is a superclass of "EngineArranged" class (EngineArranged is subclass in this scenario)
        EngineArranged engine = new EngineArranged("combustion", "hz", "Volkswagen", "VW GOLF 1L");
        System.out.println("Engine type: " + engine.getEngineType());
        System.out.println("Manufacture: " + engine.getManufacturer());         // NOTE: Burası normalde "EngineArranged" classında tanımlanmadı fakat "Part" classını extend ettiği için bu şekilde kullanabildik


        // Calling the Constructor of the Superclass
        /*
            You use the keyword "super" to call the constructor of the superclass.
            The call receives as parameters the types of values that the superclass constructor requires
            If there are multiple constructors in the superclass, the parameters of the super call dictate which of them is used
        */
        Superclass sup = new Superclass();
        Subclass sub = new Subclass();

        System.out.println(sup);      // Output: Example
        System.out.println(sub);      // Output: Subclass


        // Exercise: "Person" as a superclass and "Student", "Teacher" as subclasses
        Person prs1 = new Person("Ahmet", "Istanbul");
        Person prs2 = new Person("Tommy", "London");
        System.out.println(prs1);
        System.out.println(prs2);
        System.out.println();

        // Student Class
        Student std = new Student("Paul", "Manchester");
        System.out.println(std);
        System.out.println("Study credits: " + std.getCredits());
        std.study();
        std.study();
        std.study();
        System.out.println("Study credits: " + std.getCredits());
        System.out.println(std);
        System.out.println();

        // Teacher Class
        Teacher teacher = new Teacher("Andrew", "Tokyo", 3500);
        System.out.println(teacher);

        Student student = new Student("Hans", "Berlin");

        int i = 0;
        while (i < 25) {
            student.study();
            i++;
        }

        System.out.println(student);
        System.out.println();

        // List All Persons
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Student("Alessio", "Milano"));
        persons.add(new Teacher("Jose", "Lisbon", 5000));

        Main.printPersons(persons);


        // Exercise: "Employee" as superclass. "Manager" as subclass
        Employee employee = new Employee("Ahmet", "Software", 5000);
        employee.showInfos();

        Manager manager = new Manager("Josh", "Hardware", 4500, 3);
        manager.showInfos();
        System.out.println();

        manager.raiseSalary(500);
        System.out.println();

        System.out.println(manager);
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person e : persons) {
            System.out.println(e);
        }
    }
}


/*
    Every Java class extends the class Object, which means that every class we create has at its disposal all the methods defined in the Object class.
    If we want to change how these methods are defined in Object function, they must be overriden by defining a new implementation for them in the newly created class.
    The objects we create receive the methods equals and hashCode, among others, from the Object class

    When we examine the API (Application Programming Interface) of Java's ArrayList, we notice that ArrayList has the superclass AbstractList.
    AbstractList, in turn, has the class Object as its superclass
    java.lang.Object
        java.util.AbstractCollection<E>
            java.util.AbstractList<E>
                java.util.ArrayList<E>

    Each class can directly extend only one class
    However, a class indirectly inherits all the properties of the classes it extends
    So the ArrayList class derives from the class AbstractList and indirectly derives from the classes AbstractCollection and Object
    So ArrayList has at its disposal all the variables and methods of the classes AbstractList, AbstractCollection, and Object

    You use the keyword "extends" to inherit the properties of a class
    The class that receives the properties is called the "subclass"
    The class whose properties are inherited is called the "superclass"

    Child class, Parent class'ın tüm metodlarına ve variable'larına erişim sağlayabilir (private variable tanımlıysa getter'la erişim sağlar)

    Access modifiers private, protected, and public
    If a method or variable has the access modifier "private", it is visible only to the internal methods of that class
    Subclasses will not see it, and a subclass has no direct means to access it
    So, from the "EngineArranged" class there is no way to directly access the variables identifier, manufacturer, and description, which are defined in the superclass "Part"
    The programmer cannot access the variables of the superclass that have been defined with the access modifier "private"
    A subclass sees everything that is defined with the public modifier in the superclass
    If we want to define some variables or methods that are visible to the subclasses but invisible to everything else, we can use the access modifier "protected" to achieve this
*/