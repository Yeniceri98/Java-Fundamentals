package sections.sec59_File_Input_Output;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String[] names = {"John", "Carl", "Jesse"};

        // Writing File

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\eyenahm\\workspace\\Tutorials - Projects\\Java\\Java_Tutorial\\_59_File_Input_Output\\output.txt"));
            writer.write("I'm writing to a file");
            writer.write("\nHere is another line");

            for (String name: names) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading File

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\eyenahm\\workspace\\Tutorials - Projects\\Java\\Java_Tutorial\\_59_File_Input_Output\\output.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


