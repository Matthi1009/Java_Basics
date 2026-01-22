package streamer;


public class StandardAccount extends Account{
	private String[] ads = new String[4];
	
	public StandardAccount(String userName) {
		super(userName, 2);
		
		ads[0] = "Gute Energie von Oakridge Atomkraftwerk";
		ads[1] = "Nur 13,90€ bei Leopoldauer Alm";
		ads[2] = "Bestes WLAN nur in der HTL Leoben";
		ads[3] = "Nutze alles außer Eclipse";
	}
	
	@Override
	public void playSong(Song song) {
		super.playSong(song);
		int randomnum = (int) (Math.random() * 4);
		System.out.println("WERBUNG");
		System.out.println(ads[randomnum]);
	}
	
	
	
}
