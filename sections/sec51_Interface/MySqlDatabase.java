package sections.sec51_Interface;

public class MySqlDatabase implements IDatabaseAdvanced {
    @Override
    public void add() {
        System.out.println("MySql Add");
    }

    @Override
    public void delete() {
        System.out.println("MySql Delete");
    }

    @Override
    public void get() {
        System.out.println("MySql Get");
    }

    @Override
    public void update() {
        System.out.println("MySql Update");
    }
}
