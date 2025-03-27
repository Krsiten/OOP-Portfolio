
public class BasketballStats extends PlayerStats{
	
	static int points;
	static int rebounds;
	static int assists;
	static int blocks;
	static int steals;
	
	
	public BasketballStats(String firstnames, String lastnames, int pointsScored, int reboundsScored,
			int assistsScored, int blocksScored, int stealsScored, int appearance, int win, int lose) {
		forename = firstnames;
		surname = lastnames;
		points = pointsScored;
		rebounds = reboundsScored;
		assists = assistsScored;
		blocks = blocksScored;
		steals = stealsScored;
		gamesPlayed = appearance;
		wins = win;
		losses = lose;
	}
	
	public void PrintBbStats() {
		String statsMsg = String.format("Player: %s %s \nPoints: %d \nRebounds: %d \nAssists: %d " 
				+ "\nBlocks: %d \nSteals: %d", forename, surname, points, rebounds, assists, blocks, steals);
		System.out.println(statsMsg);
	}
}
