package sections.sec44b_Inheritance_Types;

class A {
    public void print_A() { System.out.println("Class A"); }
}

class B extends A {
    public void print_B() { System.out.println("Class B"); }
}

class C extends A {
    public void print_C() { System.out.println("Class C"); }
}

class D extends A {
    public void print_D() { System.out.println("Class D"); }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        B obj_b = new B();
        obj_b.print_A();
        obj_b.print_B();

        C obc_c = new C();
        obc_c.print_A();
        obc_c.print_C();

        D obj_d = new D();
        obj_d.print_A();
        obj_d.print_D();
    }
}

/*
    In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one subclass
*/