package sections.sec44b_Inheritance_Types;

class Parent {
    public int numA;

    public Parent(int numA) {
        this.numA = numA;
    }

    public void executeParentClassMethod() {
        System.out.println("This is a method belongs to Parent Class");
    }

    public int getNumA() {
        return numA;
    }
}

class Child extends Parent {
    private int numB;

    public Child(int numA, int numB) {
        super(numA);
        this.numB = numB;
    }

    public void executeChildClassMethod() {
        System.out.println("This is a method belongs to Child Class");
    }

    public int getNumB() {
        return numB;
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Child child = new Child(10, 15);

        child.executeParentClassMethod();
        child.executeChildClassMethod();

        System.out.println(child.getNumA());
        System.out.println(child.getNumB());
    }
}

/*
    In single inheritance, a sub-class is derived from only one super class
    It inherits the properties and behavior of a single-parent class
    Sometimes, it is also known as simple inheritance
*/
