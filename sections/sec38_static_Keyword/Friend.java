package sections.sec38_static_Keyword;

public class Friend {
    String name;
    static int numberOfFriends;     // static kullanmazsak Main class'da Friend.numberOfFriends şeklinde direkt class'ın metodu olarak tanımlayamayız

    public Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    // Static Method
    public static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
