package sections.sec3_Random_Numbers;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // No Limit
        int x = random.nextInt();
        System.out.println(x);

        // With Limit
        int y = random.nextInt(3);          // 0 to 3
        System.out.println(y);

        int z = random.nextInt(10) + 1;     // 1 to 10
        System.out.println(z);

        double m = random.nextDouble();     // 0 to 1 (Aradaki tüm virgüllü değerler)
        System.out.println(m);

        boolean choose = random.nextBoolean();
        System.out.println(choose);
    }
}
