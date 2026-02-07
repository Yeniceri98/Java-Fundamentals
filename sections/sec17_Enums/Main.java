package sections.sec17_Enums;

public class Main {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.HIGH;
        System.out.println(myVar);
        System.out.println();

        // Loop Through an Enum
        for (Level e : Level.values()) {
            System.out.println(e);
        }
    }
}

/*
    "enum" is a special class that represents a group of constants (unchangeable variables, like final variables)
    To create an enum, use the "enum" keyword (instead of class or interface), and separate the constants with a comma
    Note that they should be in uppercase letters.
    You can access enum constants with the dot syntax
*/
