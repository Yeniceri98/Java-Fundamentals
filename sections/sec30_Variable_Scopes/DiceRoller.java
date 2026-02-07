package sections.sec30_Variable_Scopes;

import java.util.Random;

public class DiceRoller {

    // 1. YOL: Global variable oluşturmadan parametre yollayarak yapabilir
//    public DiceRoller() {
//        Random random = new Random();
//        int number = 0;
//        roll(random, number);
//    }
//
//    public void roll(Random random, int number) {
//        number = random.nextInt(6) + 1;
//        System.out.println(number);
//    }

    Random random;
    int number = 0;

    // 2. YOL: Yukarıda global bir variable oluşturup istediğimiz her yerde kullanabiliriz
    public DiceRoller() {
        random = new Random();
        roll();
    }

    public void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
