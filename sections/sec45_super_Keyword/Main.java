package sections.sec45_super_Keyword;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman", 45, "Money");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
        System.out.println(hero1);
    }
}

/*
    "super" keyword refers to the superclass (parent) of an object
    It's very similar to the "this" keyword
*/
