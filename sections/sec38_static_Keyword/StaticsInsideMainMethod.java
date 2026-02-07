package sections.sec38_static_Keyword;

public class StaticsInsideMainMethod {
    // 1) static & instance variables
    static int a = 1;
    int b = 2;

    // 2) static & instance methods
    static void staticMethod() {
        System.out.println("static method");
    }
    void instanceMethod() {
        System.out.println("instance method");
    }

    // 3) static & normal class
    static class StaticNested {
        void run() { System.out.println("StaticNested.run"); }
    }
    class Inner {
        void run() { System.out.println("Inner.run"); }
    }

    public static void main(String[] args) {
        // Static Variable
        System.out.println(a);

        // Instance Variable
        StaticsInsideMainMethod myObject = new StaticsInsideMainMethod();
        System.out.println(myObject.b);

        // Static Method
        StaticsInsideMainMethod.staticMethod();

        // Instance Method
        StaticsInsideMainMethod myObject2 = new StaticsInsideMainMethod();
        myObject2.instanceMethod();

        // Static Nested Class (Direkt new yapılabilir. Better approach)
        StaticNested sn = new StaticNested();
        sn.run();

        // Inner Class: (Outer instance ile yapılmalıdır)
        StaticsInsideMainMethod myObject3 = new StaticsInsideMainMethod();
        Inner in = myObject3.new Inner();
        in.run();
    }
}
