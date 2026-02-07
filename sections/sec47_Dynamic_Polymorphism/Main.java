package sections.sec47_Dynamic_Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Team team;

        System.out.println("Which team name you want to see?");
        System.out.print("1: Fenerbahçe / 2: Galatasaray ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            team = new Fenerbahce();
            team.printTeamName();
        }

        if (choice == 2) {
            team = new Galatasaray();
            team.printTeamName();
        }

        else {
            team = new Team();
            team.printTeamName();
        }
    }
}

class Team {
    public void printTeamName() {
        System.out.println("Teams");
    }
}

class Fenerbahce extends Team {
    public void printTeamName() {
        System.out.println("Fenerbahçe");
    }
}

class Galatasaray extends Team {
    public void printTeamName() {
        System.out.println("Galatasaray");
    }
}
