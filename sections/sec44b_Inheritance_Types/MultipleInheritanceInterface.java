package sections.sec44b_Inheritance_Types;

interface First {
    void printFirst();
}

interface Second {
    void printSecond();
}

class ChildClass implements First, Second {

    @Override
    public void printFirst() {
        System.out.println("printFirst() method");
    }

    @Override
    public void printSecond() {
        System.out.println("printSecond() method");
    }
}
public class MultipleInheritanceInterface {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.printFirst();
        child.printSecond();

        // It can only reach "First" class
        First childFirst = new ChildClass();
        childFirst.printFirst();

        // It can only reach "Second" class
        Second childSecond = new ChildClass();
        childSecond.printSecond();
    }
}

/*
    In Multiple inheritances, one class can have more than one superclass and inherit features from all parent classes
    Java does not support multiple inheritances with classes
    In Java, we can achieve multiple inheritances only through Interfaces
    So we use "implement" instead of "extends"

    NOTE: Bu örnek özelinde 3. bir interface oluşturup 1 ve 2. interface'i extend edip ChildClass'ta son oluşturulan interface'i implement ederek de yapılabilir
*/