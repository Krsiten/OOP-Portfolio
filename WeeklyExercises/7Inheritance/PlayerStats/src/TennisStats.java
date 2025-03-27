
public class TennisStats extends PlayerStats{
	
	static int rank;
	static int titles;
	static int elo;
	
	public TennisStats(String firstnames, String lastnames, int currentRank, int currentTitles, int currentElo,
			int appearance, int win, int lose) {
		forename = firstnames;
		surname = lastnames;
		rank = currentRank;
		titles = currentTitles;
		elo = currentElo;
		gamesPlayed = appearance;
		wins = win;
		losses = lose;
	}
	
	public void PrintTStats() {
		String statsMsg = String.format("Player: %s %s \nRank: %d \nTitles: %d \nElo: %d", forename, 
				surname, rank, titles, elo);
		System.out.println(statsMsg);
	}
	
}