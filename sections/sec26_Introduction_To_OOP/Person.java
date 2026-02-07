package sections.sec26_Introduction_To_OOP;

// Creating a Class
public class Person {
    private String name;
    private int age;


    // Defining a Constructor
    // The constructor contains the expression this.age = 0. This expression sets the instance variable age of the newly created object (i.e., "this" object's age) to 0.
    // The second expression this.name = initialName likewise assigns the string passed as a parameter to the instance variable name of the object created.
    public Person(String initialName) {
        this.name = initialName;
        this.age = 10;
    }


    // Defining Methods For an Object
    // The method name is preceded by public void, since the method is intended to be visible to the outside world (public), and it does not return a value (void).
    public void printPerson() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);        // NOTE: "this" koymak gerekmez
    }


    // Changing an Instance Variable's Value in a Method
    public void growOlder() {
        if (this.age < 30)
            this.age = this.age + 1;
    }


    // Returning a Value From a Method
    public int returnAge() {
        return this.age;
    }

    public boolean isLegalAge() {
        if (this.age < 18)
            return false;
        return true;
    }


    // Getters
    public String getName() {
        return this.name;               // NOTE: "this" koymasak da olur
    }

    public int getAge() {
        return this.age;
    }


    // toString()
    public String toString() {
        return this.name + " is " + this.age + " years old";    // NOTE: "this" koymasak da olur

    }
}



/*
    Creating a Class
    Variables defined inside a class are called instance variables, or object fields or object attributes
    The keyword "private" means that the variables are hidden inside the object. This is known as "encapsulation"
*/
/*
    Defining a Constructor
    We want to set an initial state for an object that's created
    Custom objects are created the same way as objects from pre-made Java classes, such as ArrayList, using the new keyword
    It'd be convenient to pass values to the variables of that object as it's being created

    For example, when creating a new person object, it's useful to be able to provide it with a name:
    public static void main(String[] args) {
        Person ada = new Person("Ada");
        // ...
    }

    This is achieved by defining the method that creates the object, i.e., its constructor
    The constructor is defined after the instance variables
    The constructor's name is always the same as the class name. The class in the example above is named Person, so the constructor will also have to be named Person
*/
/*
    Defining Methods For an Object
    We know how to create an object and initialize its variables. However, an object also needs methods to be able to do anything
    As we've learned, a "method" is a named section of source code inside a class which can be invoked
*/
/*
    Getters
    Let's fine-tune the solution a bit more. In its current form, a person can only be "printed" in a way that includes both the name and the age
    Situations exist, however, where we may only want to know the name of an object. Let's write a separate method for this use case:

    public class Person {
        ...

        public String getName() {
            return this.name;
        }
    }

    The getName method returns the instance variable name to the caller
    It is the convention in Java to name a method that returns an instance variable exactly this way, i.e., getVariableName
    Such methods are often referred to as "getters"
*/
/*
    We are guilty of programming in a somewhat poor style by creating a method for printing the object, i.e., the printPerson method
    A preferred way is to define a method for the object that returns a "string representation" of the object
    The method returning the string representation is always toString in Java
    The toString() functions as printPerson does. However, it doesn't itself print anything but instead returns a string representation, which the calling method can execute for printing as needed

    public class Person {
        ...

        public String toString() {
            return this.name + ", age " + this.age + " years";
        }
    }

    When a programmer writes:
    System.out.println(person1);

    Java extends the call at run time to the following form:
    System.out.println(person1.toString());
*/
/*
    Method Parameters
    NOTE: "BodyMassIndex" adında class oluşturup "MainOthers" dosyasında tanımladım
*/
