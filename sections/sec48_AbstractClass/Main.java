package sections.sec48_AbstractClass;

public class Main {
    public static void main(String[] args) {
        // AbstractDatabase abstractDatabase = new AbstractDatabase()   Bu şekilde abstract tanımlaması yapılamaz!!!

        AbstractDatabase mySqlDB = new MySqlDatabase();
        AbstractDatabase mongoDB = new MongoDB();

        mySqlDB.add();
        mySqlDB.update();
        mySqlDB.delete();
        mySqlDB.get();

        mongoDB.add();
        mongoDB.update();
    }
}
