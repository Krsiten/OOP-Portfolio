
public class PlayerStats {
	protected String forename;
	protected String surname;
	protected int gamesPlayed;
	protected int wins;
	protected int losses;
	
	public void generalStats( ) {
		String statsMsg = String.format("Player: %s %s \nGames played: %d \nWins: %d \nLosses: %d", 
				forename, surname, gamesPlayed, wins, losses);
		System.out.println(statsMsg);
	}
}
