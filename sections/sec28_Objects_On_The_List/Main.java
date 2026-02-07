package sections.sec28_Objects_On_The_List;

public class Main {
    public static void main(String[] args) {
        // "Playlist" Class
        Playlist list = new Playlist();
        list.addSong("Numb");
        list.addSong("In the end");
        list.printSongs();


        // "Menu" Class
        Menu menu = new Menu();
        menu.addMeal("Soup");
        menu.addMeal("Steak");
        menu.addMeal("Tiramisu");
        menu.addMeal("Tiramisu");
        menu.printMeals();

        menu.clearMenu();
        menu.printMeals();


        // "Person" and "AmusementParkRide" Classes
        Person prs1 = new Person("Ahmet");
        prs1.setWeight(80);
        prs1.setHeight(178);

        Person prs2 = new Person("Angela");
        prs2.setWeight(53);
        prs2.setHeight(160);

        AmusementParkRide park = new AmusementParkRide("Aqua Park", 145);
        System.out.println(park);
        System.out.println();

        if (park.isAllowedOn(prs1)) {
            System.out.println(prs1.getName() + " is allowed on the ride");
        } else {
            System.out.println(prs1.getName() + " is not allowed on the ride!");
        }

        if (park.isAllowedOn(prs2)) {
            System.out.println(prs2.getName() + " is allowed on the ride");
        } else {
            System.out.println(prs2.getName() + " is not allowed on the ride!");
        }

        System.out.println(park);

        park.removeEveryoneOnRide();
        System.out.println(park);


        // Example: Workshop example using "Gift" and "Package" Classes
        Gift gift1 = new Gift("Les Miserables", 2);
        System.out.println("Gift's name: " + gift1.getName());
        System.out.println("Gift's weight: " + gift1.getWeight());
        System.out.println("Gift: " + gift1);

        Gift gift2 = new Gift("Pencil", 4);
        Gift gift3 = new Gift("Desk", 35);

        Package allGifts = new Package();
        allGifts.addGift(gift1);
        allGifts.addGift(gift2);
        allGifts.addGift(gift3);

        // NOTE: Alttaki şekilde de obje oluşturup listeye ekleyebiliriz. Yukarıda "Gift" classından oluşturulan objeleri çekerek yapmıştık
        allGifts.addGift(new Gift("Glass", 10));

        System.out.println(allGifts.getTotalWeight());


        // Example: Height Order example using "Person2" and "Room" Classes
        Room room = new Room();
        System.out.println("Shortest: " + room.shortest());         // null
        System.out.println("Is room empty? " + room.isEmpty());     // true

        room.addRoom(new Person2("Ahmet", 180));
        room.addRoom(new Person2("Caroline", 165));
        room.addRoom(new Person2("Jake", 194));
        room.addRoom(new Person2("Tommy", 173));
        room.addRoom(new Person2("Maria", 163));
        System.out.println("Is room empty? " + room.isEmpty());     // false
        System.out.println();

        for (Person2 person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.shortest() + "\n");
        room.takeShortestPerson();
        System.out.println("New List Without The Shortest Person: ");

        for (Person2 person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("List In Height Order: ");

        while (!room.isEmpty()) {
            System.out.println(room.takeShortestPerson());
        }


        // Example: Cargo Hold exercise using "Item", "Suitcase" and "Hold" Classes
        Item myBook = new Item("Lord of the rings", 2);
        Item myPencil = new Item("Rotring", 1);

        System.out.println("Name of the book is " + myBook.getName());
        System.out.println("Weight of the book is " + myBook.getWeight());
        System.out.println("Name of the pencil is " + myPencil.getName());
        System.out.println("Weight of the pencil is " + myPencil.getWeight());

        System.out.println("Book: " + myBook);
        System.out.println("Pencil: " + myPencil);
        System.out.println();


        Suitcase firstSuitcase = new Suitcase(5);
        System.out.println(firstSuitcase);               // 0

        firstSuitcase.addItem(myBook);
        System.out.println(firstSuitcase);               // 0 + 2 = 2

        firstSuitcase.addItem(myPencil);
        System.out.println(firstSuitcase);               // 2 + 1 = 3

        firstSuitcase.addItem(new Item("Phone", 4));
        System.out.println(firstSuitcase);               // 3 + 4 = 7 (Çantaya sığmayacağı için yine 3 yazdırır)

        System.out.println();
        System.out.println("First suitcase contains the items below: ");
        firstSuitcase.printItems();
        System.out.println("Total weight: " + firstSuitcase.totalWeight() + " kg");


        Item heaviest = firstSuitcase.heaviest();
        System.out.println("Heaviest item in the first suitcase is " + heaviest);


        Suitcase secondSuitcase = new Suitcase(15);
        secondSuitcase.addItem(myBook);
        secondSuitcase.addItem(myBook);
        secondSuitcase.addItem(myBook);
        secondSuitcase.addItem(new Item("Desk", 8));

        Suitcase thirdSuitcase = new Suitcase(13);
        thirdSuitcase.addItem(myPencil);
        thirdSuitcase.addItem(myPencil);
        thirdSuitcase.addItem(myPencil);
        thirdSuitcase.addItem(myPencil);

        Hold hold = new Hold(1000);
        hold.addSuitcase(firstSuitcase);
        hold.addSuitcase(secondSuitcase);
        hold.addSuitcase(thirdSuitcase);

        System.out.println();
        System.out.println("Suitcases: ");
        hold.printItems();
        System.out.println("Total weight: " + hold.weightOfSuitcases());
    }
}
