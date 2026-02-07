package sections.sec72_SOLID;

/*
    BAD IMPLEMENTATION:

    class MySqlDatabase {
        public void save(String data) {
            System.out.println("Saved to MySQL");
        }
    }

    class DataService {
        private MySqlDatabase database = new MySqlDatabase();   // DataService direkt MySQL’e bağlı

        public void save(String data) {
            database.save(data);
        }
    }

*/

interface Database {
    void save(String data);
}

class MySqlDatabase implements Database {
    public void save(String data) {
        System.out.println("Saved to MySQL");
    }
}

class MongoDatabase implements Database {
    public void save(String data) {
        System.out.println("Saved to MongoDB");
    }
}

class DataService {
    private final Database database;

    public DataService(Database database) {
        this.database = database;
    }

    public void save(String data) {
        database.save(data);
    }
}

public class DependencyInversion {
    public static void main(String[] args) {
        DataService dataServiceMysql = new DataService(new MySqlDatabase());
        dataServiceMysql.save("data");

        DataService dataServiceMongo = new DataService(new MongoDatabase());
        dataServiceMongo.save("data");
    }
}

// High-level modüller low-level modüllere bağımlı olmamalıdır. Her ikisi de abstraction’a bağımlı olmalıdır