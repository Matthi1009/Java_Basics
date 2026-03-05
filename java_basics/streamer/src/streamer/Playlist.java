package streamer;

import java.util.Random;

public class Playlist {
    private String name;
    private Song[] songs;
    private int songIndex;
    private int currentIndex; // Verfolgt den aktuell abgespielten Song
    private Random random;

    public Playlist(String name) {
        this.name = name;
        this.songs = new Song[15];
        this.songIndex = 0;
        this.currentIndex = -1; // -1 bedeutet: noch kein Song abgespielt
        this.random = new Random();
    }

    public String getName() {
        return name;
    }

    public int getSongIndex() {
        return songIndex;
    }

    public void addSong(Song song) {
        if (songIndex < songs.length) {
            songs[songIndex] = song;
            songIndex++;
            System.out.println("Song hinzugefügt!");
        } else {
            System.out.println("Playlist ist voll!");
        }
    }

    public void showSongCount() {
        System.out.println("Anzahl Songs: " + songIndex);
    }

    public void remainingSongs() {
        System.out.println("Noch Platz für " + (songs.length - songIndex) + " Songs");
    }

    public void playNext() {
        if (songIndex == 0) {
            System.out.println("Keine Songs vorhanden");
            return;
        }
        currentIndex = (currentIndex + 1) % songIndex;
        System.out.println("Jetzt wird gespielt: " + songs[currentIndex]);
    }


    public void playPrevious() {
        if (songIndex == 0) {
            System.out.println("Keine Songs vorhanden");
            return;
        }
        currentIndex = (currentIndex - 1 + songIndex) % songIndex;
        System.out.println("Jetzt wird gespielt: " + songs[currentIndex]);
    }

    public void playRandom() {
        if (songIndex == 0) {
            System.out.println("Keine Songs vorhanden");
            return;
        }
        currentIndex = random.nextInt(songIndex);
        System.out.println("Jetzt wird zufällig gespielt: " + songs[currentIndex]);
    }
}
