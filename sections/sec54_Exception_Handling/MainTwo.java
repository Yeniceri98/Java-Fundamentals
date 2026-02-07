package sections.sec54_Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainTwo {

    public static void main(String[] args) {
        //ExceptionHandling.show();
        ExceptionHandling.showTwo();
    }
}

class ExceptionHandling {

    public static void show() {
        try {
            var reader = new FileReader("file.txt");
            System.out.println("File opened");
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    /*
        MULTIPLE EXCEPTION
        Örnek olarak "FileNotFoundException" ve "IOException" kullandığımızı düşünelim
        IOException hiyerarşide FileNotFoundException'ın üzerinde yer aldığı için sadece IOException tanımlamamız yeterlidir
        Bu durumda hiyerarşide IOException'ın altında yer alan tüm exceptionlar için IOException kullanabiliriz. Hiyerarşide altta kalanlar tanımlanmasa da olur
        Fakat spesifik olarak hangi hatanın alındığını kullanıcıya gösterebilmek için Exception'ları ayrı ayrı tanımlayabiliriz
        Bu durumda IOException'ın catch bloğu (hiyerarşide üstte yer alan) FileNotFoundException'dan sonra gelmelidir
        Örnek olarak 1 tane de "ParseException" ekledik
        ParseException ile IOException aynı hiyerarşide yer aldığı için | ile OR'ladık
    */
    public static void showTwo() {
        FileReader reader = null;

        try {
            reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        } catch (IOException | ParseException  e) {
            System.out.println("Could not read data");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("Finally block that will execute no matter what");
        }
    }
}


/*
    _____ EXCEPTION TYPES _____

    1) Checked
    - Checked exceptions are also known as "compile-time" exceptions as these exceptions are checked by the compiler during the compilation process to confirm whether the exception is handled by the programmer or not
    - If not, then the system displays a compilation error
    - Some examples:
    - SQLException, IOException, InvocationTargetException, ClassNotFoundException

    2) Unchecked
    - The unchecked exceptions are those exceptions that occur during the execution of the program
    - Hence they are also referred to as "Runtime" exceptions
    - These exceptions are generally ignored during the compilation process. They are not checked while compiling the program
    - For example, programming bugs like logical errors, and using incorrect APIs
    - Some examples:
    - NullPointerException, ArithmeticException, IllegalArgumentException, IndexOutOfBoundsException, IllegalStateException

    3) Error
    - "Runtime" exception
    - Examples:
    - StackOverFlowError, OutOfMemoryError

    EXAMPLE:
    FileReader "checked" exception'dır. IDE otomatikman exception tanımlanmadığında kullanıcıyı uyarır
*/
/*
    _____ EXCEPTION HIERARCHY ______

    Paketin içerisinde hiyerarşiyi gösteren PNG var

    https://docs.oracle.com/javase/8/docs/api/java/lang/NullPointerException.html
    Örneğin yukarıdaki dökümantasyonda NullPointerException'a baktığımız zaman hiyerarşisini görebiliriz:
    java.lang.Object
        java.lang.Throwable
            java.lang.Exception
                java.lang.RuntimeException
                    java.lang.NullPointerException
*/