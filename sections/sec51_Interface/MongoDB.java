package sections.sec51_Interface;

public class MongoDB implements IDatabaseAdvanced {
    @Override
    public void add() {
        System.out.println("MongoDB Add");
    }

    @Override
    public void delete() {
        System.out.println("MongoDB Delete");
    }

    @Override
    public void get() {
        System.out.println("MongoDB Get");
    }

    @Override
    public void update() {
        System.out.println("MongoDB Update");
    }
}
