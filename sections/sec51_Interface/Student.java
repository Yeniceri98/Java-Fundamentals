package sections.sec51_Interface;

public class Student implements IDatabase {

    @Override                   // @Override koyulması şart değildir. alt + enter ile otomatik import edince kendiliğinden ekler
    public void log() {
        System.out.println("Student is added");
    }
}
