package streamer;

import java.util.Scanner;

public class Player {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Account auswählen
        Account account = chooseAccount(scan);

        int choice;
        do {
            choice = mainMenu(scan);

            switch (choice) {
                case 1: // Playlist erstellen
                    createPlaylist(scan, account);
                    break;

                case 2: // Song zu Playlist hinzufügen
                    addSongToPlaylist(scan, account);
                    break;

                case 3: // Songs anzeigen
                    showSongsInPlaylists(account);
                    break;

                case 4: // Playlists anzeigen
                    showPlaylists(account);
                    break;

                case 0:
                    System.out.println("Programm beendet.");
                    break;

                default:
                    System.out.println("Ungültige Auswahl!");
            }

        } while (choice != 0);

        scan.close();
    }

    // ------------------------------------------------------
    // Account wählen
    public static Account chooseAccount(Scanner scan) {
        System.out.print("Account Auswahl (Standard = 1 / Premium = 0): ");
        int answer = scan.nextInt();
        scan.nextLine();

        System.out.print("Benenne deinen Account: ");
        String name = scan.nextLine();

        if (answer == 1) {
            return new StandardAccount(name);
        } else {
            return new PremiumAccount(name);
        }
    }

    // ------------------------------------------------------
    // Playlist erstellen
    public static void createPlaylist(Scanner scan, Account account) {
        account.newPlaylist(scan, account.getMaxPlaylists());
    }

    // ------------------------------------------------------
    // Song hinzufügen
    public static void addSongToPlaylist(Scanner scan, Account account) {
        Playlist[] pls = account.getPlayLists();
        boolean hasPlaylist = false;
        for (Playlist p : pls) {
            if (p != null) {
                hasPlaylist = true;
                break;
            }
        }

        if (!hasPlaylist) {
            System.out.println("Erstelle zuerst eine Playlist!");
            return;
        }

        // Playlists anzeigen und auswählen
        System.out.println("Wähle eine Playlist aus:");
        for (int i = 0; i < pls.length; i++) {
            if (pls[i] != null) {
                System.out.println((i + 1) + ": " + pls[i].getName());
            }
        }
        int playlistNum = scan.nextInt() - 1;
        scan.nextLine();

        if (playlistNum < 0 || playlistNum >= pls.length || pls[playlistNum] == null) {
            System.out.println("Ungültige Auswahl!");
            return;
        }

        Playlist playlist = pls[playlistNum];

        // Song erstellen
        System.out.print("Songname: ");
        String name = scan.nextLine();
        System.out.print("Interpret: ");
        String artist = scan.nextLine();
        System.out.print("Genre: ");
        String genre = scan.nextLine();

        Song song = new Song(name, artist, genre);

        // Song zur Playlist hinzufügen
        playlist.addSong(song);
    }

    // ------------------------------------------------------
    // Songs in allen Playlists anzeigen
    public static void showSongsInPlaylists(Account account) {
        Playlist[] pls = account.getPlayLists();
        boolean hasSong = false;

        for (Playlist p : pls) {
            if (p != null) {
                System.out.println("Playlist: " + p.getName());
                if (p.getSongIndex() == 0) {
                    System.out.println("  Keine Songs.");
                } else {
                    for (int i = 0; i < p.getSongIndex(); i++) {
                        System.out.println("  " + (i + 1) + ": " + p.getSongIndex());
                    }
                }
                hasSong = true;
            }
        }

        if (!hasSong) {
            System.out.println("Keine Playlists oder Songs vorhanden.");
        }
    }

    // ------------------------------------------------------
    // Playlists anzeigen
    public static void showPlaylists(Account account) {
        Playlist[] pls = account.getPlayLists();
        boolean hasPlaylist = false;

        for (int i = 0; i < pls.length; i++) {
            if (pls[i] != null) {
                System.out.println((i + 1) + ": " + pls[i].getName());
                hasPlaylist = true;
            }
        }

        if (!hasPlaylist) {
            System.out.println("Keine Playlists erstellt.");
        }
    }

    // ------------------------------------------------------
    // Hauptmenü
    public static int mainMenu(Scanner scan) {
        System.out.println(
                "\n======================" +
                "\n🎵 MUSIK PLAYER 🎵" +
                "\n[1] Playlist erstellen" +
                "\n[2] Song zu Playlist hinzufügen" +
                "\n[3] Songs anzeigen" +
                "\n[4] Playlists anzeigen" +
                "\n[0] Beenden" +
                "\n======================"
        );
        System.out.print("Auswahl: ");
        int answer = scan.nextInt();
        scan.nextLine();
        return answer;
    }
}
