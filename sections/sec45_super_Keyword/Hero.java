package sections.sec45_super_Keyword;

public class Hero extends Person {
    String power;

    public Hero(String name, int age, String power) {
        super(name, age);       // Person class'ından aldık
        this.power = power;
    }

    public String toString() {
        // return super.toString();         // Sadece Person class'ındaki toString() kısmını alır
        return super.toString() + power;
        // return power;                    // super keyword'üyle superclass'daki toString() metodunu yazdırmak şart değildir
    }
}
