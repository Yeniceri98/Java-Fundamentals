package sections.sec55_File_Class;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("yt_brocode_fullcourse_recap/_27_File_Class/deneme.txt");

        if (file.exists()) {
            System.out.println("That file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());      // file ise true, değilse (folder olabilir) false döndürür
            // file.delete();       Dosyayı sildikten sonra refresh atmamız gerekir
        } else {
            System.out.println("That file does not exist");
        }
    }
}
