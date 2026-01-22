package streamer;

import java.util.Scanner;

public class Account {
	private String userName;
	private Playlist[] PlayLists;
	private int playIndex;
	private int maxPlayLists;
	
	public Account(String userName, int maxPlayLists) {
		this.maxPlayLists = maxPlayLists;
		this.userName = userName;
		playIndex = 0;
		this.PlayLists = new Playlist[maxPlayLists];
	}
	
//-------------------------------------------------------------------------------------------	
	public String getUserName() {
		return userName;
	}
	public Playlist[] getPlayLists() {
		return PlayLists;
	}
	public int getPlayIndex() {
		return playIndex;
	}
	
	public int getMaxPlaylists() {
		return maxPlayLists;
	}

//------------------------------------------------------------------------------------------
	
	public void newPlaylist(Scanner scan, int num) {
	    if (playIndex < num) {
	        System.out.print("Gib einen Namen für die Playlist ein: ");
	        String playlistName = scan.nextLine();

	        Playlist playlist = new Playlist(playlistName);
	        PlayLists[playIndex] = playlist;
	        playIndex++;
	    } else {
	        System.out.println("Sie können keine Playlist mehr hinzufügen!");
	    }
	}

	
	public void showPlaylists() {
		System.out.println("Playlists: ");
		for (int i = 0; i < PlayLists.length; i++) {
			if(PlayLists[i] != null) {
				System.out.printf("%d. Playlist : %s\n");
			}
		}
	}
	
	public void playSong(Song song) {
		System.out.println(song.toString());
	}
}
