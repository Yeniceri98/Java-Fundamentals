package sections.sec14_While_Loop;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Do-While Loop
        int k = 0;
        do {
            System.out.println(k);
            k++;
        }
        while (k < 5);
    }
}
