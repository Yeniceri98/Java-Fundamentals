package sections.sec57_FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("yt_brocode_fullcourse_recap/_28_FileWriter/poem.txt");       // poem adında txt dosyası oluşturur
            fileWriter.write("Roses are red \nViolets are blue");
            fileWriter.append("\nA poem by anoynmously");             // Bu şekilde de satır ekleyebiliriz
            fileWriter.close();                                       // Java 7'den itibaren try-catch kullanınca dosya kapatma işlemini otomatik yapar. Bu satıra ihtiyaç yoktur
        } catch (IOException e) {
            e.printStackTrace();
        }

        // The PrintWriter class
        // The PrintWriter class allows you to write formatted data to a file. It can output strings, primitive types and even an array of characters. The class provides several overloaded methods: print, println and printf.
        File file = new File("/home/art/Documents/file.txt");
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.print("Hello"); // prints a string
            printWriter.println("Java"); // prints a string and then terminates the line
            printWriter.println(123); // prints a number
            printWriter.printf("You have %d %s", 400, "gold coins"); // prints a formatted string
        } catch (IOException e) {
            System.out.printf("An exception occurred %s", e.getMessage());
        }
    }
}