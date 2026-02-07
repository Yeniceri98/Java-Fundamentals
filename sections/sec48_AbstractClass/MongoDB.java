package sections.sec48_AbstractClass;

public class MongoDB extends AbstractDatabase{
    @Override
    void update() {
        System.out.println("MongoDB update method");
    }

    @Override
    void get() {
        System.out.println("MongoDB get method");
    }
}
