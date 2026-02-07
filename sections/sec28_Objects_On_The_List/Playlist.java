package sections.sec28_Objects_On_The_List;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<String> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void printSongs() {
        for (String song : songs) {
            System.out.println(song);
        }
    }
}
