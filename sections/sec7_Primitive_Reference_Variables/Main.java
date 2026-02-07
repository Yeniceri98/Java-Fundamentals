package sections.sec7_Primitive_Reference_Variables;

public class Main {
    public static void main(String[] args) {
        // Primitive
        int value = 10;
        System.out.println(value);

        int first = 10;
        int second = first;
        int third = second;
        System.out.println(first + " " + second + " " + third);         // Output: 10 10 10
        second = 5;
        System.out.println(first + " " + second + " " + third);         // Output: 10 5 10

        // Reference
        Name name1 = new Name("Ahmet");
        System.out.println(name1);       // Output: Name@7c75222b (toString yapmadan önce)
        System.out.println(name1);       // Output: Ahmet

        /*
            ___ Primitive and Reference Variable as Method Parameters ___
            We mentioned earlier that the value of a primitive variable is directly stored in the variable, whereas the value of a reference variable holds a reference to an object
            We also mentioned that assigning a value with the equality sign copies the value (possibly of some variable) on the right-hand side and stores it as the value of the left-hand side variable
            A similar kind of copying occurs during a method call
            Regardless of whether the variable is primitive or reference type, the value passed to the method as an argument is copied for the called method to use
            With primitive variables, the value of the variable is conveyed to the method
            With reference variables, it's a reference.
        */

        // "Person" Class
        Person firstPerson = new Person("John");

        System.out.println(firstPerson);      // John's birthday is 1990
        youthen(firstPerson);
        System.out.println(firstPerson);      // John's birthday is 1991

        Person secondPerson = firstPerson;
        youthen(secondPerson);

        System.out.println(firstPerson);      // John's birthday is 1992
        System.out.println(secondPerson);     // John's birthday is 1992

    }

    public static void youthen(Person person) {
        person.setBirthYear(person.getBirthYear() + 1);
    }

    public static class Name {
        private String name;

        public Name(String name) {
            this.name = name;
        }

        public String toString() {
            return this.name;
        }
    }
}

/*
    Variables in Java are classified into primitive and reference variables
    From the programmer's perspective, a primitive variable's information is stored as the value of that variable, whereas a reference variable holds a reference to information related to that variable
    Reference variables are practically always objects in Java
*/
/*
    In the first example, we create a primitive int variable, and the number 10 is stored as its value
    When we pass the variable to the System.out.println method, the number 10 is printed
    In the second example, we create a reference variable called name1
    A reference to an object is returned by the constructor of the Name class when we call it, and this reference is stored as the value of the variable

    The method call System.out.println prints the value of the variable
    The value of a primitive variable is concrete, whereas the value of a reference variable is a reference
    When we attempt to print the value of a reference variable, the output contains the type of the variable and an identifier created for it by Java
    Name@7c75222b tells us that the given variable is of type Name and its identifier is 7c75222b

    The previous example applies whenever the programmer has not altered an object's default print format.
    You can modify the default print by defining the toString method within the class of the given object, where you specify what the objects print should look like.
*/
