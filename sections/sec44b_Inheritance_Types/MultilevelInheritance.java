package sections.sec44b_Inheritance_Types;

// Parent class One
class One {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

// Child class Two inherits from class One
class Two extends One {
    public void print_for() {
        System.out.println("for");
    }
}

// Child class Three inherits from class Two
class Three extends Two {
    public void print_lastgeek() {
        System.out.println("Geeks");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Three three = new Three();
        three.print_geek();
        three.print_for();
        three.print_lastgeek();
    }
}

/*
    In Multilevel Inheritance, a derived class will be inheriting a base class, and as well as the derived class also acts as the base class for other classes
*/