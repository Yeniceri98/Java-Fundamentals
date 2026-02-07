package sections.sec51_Interface;

public class CD implements Packables {
    private String artist;
    private String songName;
    private int pubYear;
    private double weight;

    public CD(String artist, String songName, int pubYear) {
        this.artist = artist;
        this.songName = songName;
        this.pubYear = pubYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return weight;
    }

    public String toString() {
        return artist + ": " + songName + " (" + pubYear + ")";
    }
}
