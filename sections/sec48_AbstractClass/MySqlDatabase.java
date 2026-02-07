package sections.sec48_AbstractClass;

public class MySqlDatabase extends AbstractDatabase {
    @Override
    void update() {
        System.out.println("MySql update method");
    }

    @Override
    void get() {
        System.out.println("MySql get method");
    }
}
