package streamer;

public class Song {
		private String name;
		private String artist;
		private String genre;
		
	public Song(String name, String artist, String genre) {
		this.name = name;
		this.artist = artist;
		this.genre = genre;
	}
	
	public String getName() {
		return name;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String genre() {
		return genre;
	}
	
	@Override
	public String toString() {
		return String.format("Song wird gespielt: \n"
				+ "Songname: " + name + "/n"
				+ "Interpret: " + artist + "\n"
				+ "Genre: " + genre);
	}
}
