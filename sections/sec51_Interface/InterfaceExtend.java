package sections.sec51_Interface;

interface A {
    void method1();
    void method2();
}

// B now includes method1 and method2
interface B extends A {
    void method3();
}

// the class must implement all method of A and B.
public class InterfaceExtend implements B {
    @Override
    public void method3() {
        System.out.println("method3");
    }

    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    public static void main(String[] args) {
        InterfaceExtend obj = new InterfaceExtend();
        obj.method3();
        obj.method1();
        obj.method2();
    }
}
