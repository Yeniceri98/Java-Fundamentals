package sections.sec58_Files_and_Reading_Data;

import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ___ Reading from the Keyboad ___
        // We've been using the Scanner-class since the beginning of this course to read user input.
        // The block in which data is read has been a while-true loop where the reading ends at a specific input.
        // In the example below, we pass system input (System.in) as a parameter to the constructor of the Scanner-class.
        // In text-based user interfaces, the input of the user is directed into the input stream one line at a time, which means that the information is sent to be handled every time the user enters a new line.
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Type something (Type 'end' to quit)");
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }
        }




        // ___ Reading From a File ___
        // Reading a file is done using the "Scanner" class.
        // When we want to read a file using the Scanner-class, we give the path for the file we want to read as a parameter to the constructor of the class.
        // The path to the file can be acquired using Java's "Paths.get" command, which is given the file's name in string format as a parameter: Paths.get("filename.extension").
        // When the Scanner object that reads the file has been created, the file can be read using a while-loop.
        // The reading proceeds until all the lines of the file have been read, i.e., until the scanner finds no more lines to read.

        try (Scanner scan = new Scanner(Paths.get("com/company/tutorial_beginning._21_Files_and_Reading_Data/deneme.txt"))) {
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
