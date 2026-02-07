package sections.sec18b_2D_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // First Way
//        String[][] cars = new String[2][2];
//
//        cars[0][0] = "BMW";
//        cars[0][1] = "Mercedes";
//        cars[1][0] = "Toyota";
//        cars[1][1] = "Renault";
//
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println();   // Satırın aşağı inmesi için gerekli
//            for (int j = 0; j < cars[i].length; j++) {
//                System.out.print(cars[i][j] + " ");
//            }
//        }
//
//
//        // Second Way
//        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10, 11}};
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println();
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.print(numbers[i][j] + " ");
//            }
//        }

        // Third Way (Get Input Values From User)
        Scanner scanner = new Scanner(System.in);
        int[][] nums = new int[3][3];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter row " + (i+1) + ": ");
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }

        // Printing 1st way
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }

        // Printing 2nd way
        for (int i = 0; i < nums.length; i++) {
            System.out.println();
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
        }

    }
}
