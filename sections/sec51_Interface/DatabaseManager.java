package sections.sec51_Interface;

class DatabaseManager {
    public void AddDatabase(IDatabaseAdvanced database) {
        database.add();
    }

    public void UpdateDatabase(IDatabaseAdvanced database) {
        database.update();
    }

    public void GetDatabase(IDatabaseAdvanced database) {
        database.get();
    }

    public void DeleteDatabase(IDatabaseAdvanced database) {
        database.delete();
    }
}
