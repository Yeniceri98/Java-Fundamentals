package sections.sec24_Classes;

class FootballTeam {
    String clubName;
    String country;
    int foundationYear;
    String colors;
    double squadValue;

    public FootballTeam(String clubName, String country, int foundationYear, String colors, double squadValue) {
        this.clubName = clubName;
        this.country = country;
        this.foundationYear = foundationYear;
        this.colors = colors;
        this.squadValue = squadValue;
    }
}

public class Example {
    public static void main(String[] args) {
        FootballTeam teamOne = new FootballTeam("Fenerbahçe", "Turkey", 1907, "Yellow and Dark Blue", 145.500);
        FootballTeam teamTwo = new FootballTeam("Real Madrid", "Spain", 1890, "White and Purple", 745.500);
        FootballTeam teamThree = new FootballTeam("Manchester City", "England", 1912, "Blue and White", 950.685);
        
        System.out.println(teamOne.clubName);
        System.out.println(teamOne.country);
        System.out.println(teamOne.foundationYear);
        System.out.println(teamOne.colors);
        System.out.println(teamOne.squadValue);
        System.out.println();

        System.out.println(teamTwo.clubName);
        System.out.println(teamTwo.country);
        System.out.println(teamTwo.foundationYear);
        System.out.println(teamTwo.colors);
        System.out.println(teamTwo.squadValue);
        System.out.println();

        System.out.println(teamThree.clubName);
        System.out.println(teamThree.country);
        System.out.println(teamThree.foundationYear);
        System.out.println(teamThree.colors);
        System.out.println(teamThree.squadValue);
    }
}
