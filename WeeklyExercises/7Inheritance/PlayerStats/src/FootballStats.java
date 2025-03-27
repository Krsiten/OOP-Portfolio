
public class FootballStats extends PlayerStats{
	
	static int goals;
	static int assists;
	
	
	public FootballStats(String firstnames, String lastnames, int goal, int assist, int appearance,
			int win, int lose) {
		forename = firstnames;
		surname = lastnames;
		goals = goal;
		assists = assist;
		gamesPlayed = appearance;
		wins = win;
		losses = lose;
	}
	
	public void PrintFbStats() {
		String statsMsg = String.format("Player: %s %s \nGoals: %d \nAssists: %d", forename, surname, 
				goals, assists);
		System.out.println(statsMsg);
	}
}
