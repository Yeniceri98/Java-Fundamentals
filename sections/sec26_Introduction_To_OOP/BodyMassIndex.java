package sections.sec26_Introduction_To_OOP;

public class BodyMassIndex {
    private String name;
    private int weight;
    private int height;

    public BodyMassIndex(String name) {
        this.name = name;
        this.weight = 0;
        this.height = 0;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public void setHeight(int newHeight) {      // NOTE: Parametrede "newHeight" yerine aynı isim olan "height" da yazılabilir
        this.height = newHeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.00;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public String getName() {
        return this.name;
    }

    public static class Main {
        public static void main(String[] args) {
    //        // ___ String Comparisons and "Equals" ___
    //        // Strings can't be compared with with the equals operator ==.
    //        // For strings, there exists a separate "equals" command, which is always appended to the end of the string that we want to compare.
    //
    //        // Example 1:
    //        String text = "Ahmet";
    //
    //        if (text.equals("Ahmet")) {
    //            System.out.println("Text variables contains the word Ahmet");
    //        } else {
    //            System.out.println("Text variables does not contains the word Ahmet");
    //        }
    //
    //
    //        // Example 2:
    //        String myText = "Turkey";
    //        String myText2 = "Spain";
    //
    //        if (myText.equals(myText2)) {
    //            System.out.println("Texts are the same");
    //        } else {
    //            System.out.println("Texts are different");
    //        }
    //
    //
    //        // Example 3: Login
    //        Scanner scanner = new Scanner(System.in);
    //
    //        System.out.print("Enter the user name: ");
    //        String userName = scanner.nextLine();
    //        System.out.print("Enter the password: ");
    //        String password = scanner.nextLine();
    //
    //        if (userName.equals("admin") && password.equals("123")) {
    //            System.out.println("User logged in");
    //        } else {
    //            System.out.println("Fail");
    //        }



            // ___ Splitting a String ___
            // You can split a string to multiple pieces with the "split" method of the String class.
            // The method takes as a parameter a string denoting the place around which the string should be split.
            // The split method returns an array of the resulting sub-parts.

            // Example 1:
            String text2 = "first second third fourth";
            String[] pieces = text2.split(" ");
            System.out.println(pieces[0]);
            System.out.println(pieces[1]);
            System.out.println(pieces[2]);
            System.out.println(pieces[3]);
            System.out.println("");

            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }
        }
    }
}

/*
    The instance variables height and weight were added to the class.
    Values for these can be set using the setHeight and setWeight methods.
    Java's standard naming convention is used once again, that is, if the method's only purpose is to set a value to an instance variable, then it's named as setVariableName.
    Value-setting methods are often called "setters".
*/
