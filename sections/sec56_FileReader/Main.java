package sections.sec56_FileReader;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("yt_brocode_fullcourse_recap/_29_FileReader/art.txt");
            int data = file.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = file.read();
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
    read() returns an int value which contains the byte value
    when read() returns -1, there is no more data to be read
*/
