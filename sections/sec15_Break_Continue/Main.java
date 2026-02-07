package sections.sec15_Break_Continue;

public class Main {
    public static void main(String[] args) {
        // BREAK
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);      // 4'e gelince yazdırmadan durdurur
        }

        // CONTINUE
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);      // 4'ü atlayıp 5'den devam eder
        }
    }
}
