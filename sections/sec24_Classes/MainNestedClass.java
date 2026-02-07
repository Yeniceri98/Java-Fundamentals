package sections.sec24_Classes;

public class MainNestedClass {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.hey();

        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.greet();

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        staticInnerClass.salude();
    }
}
