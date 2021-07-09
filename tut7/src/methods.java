public class Player {
	private String PlayerName;
	private String PlayerAge;
	private String PlayerType;
	private int NumofWikts;
	private int Totalruns;
	private int Highestscore;
	private String BestBawling;
	private int PlayedMatches;
	private double BattingAvarage;
	private double BawlingAvarage;
	private int TimesOut;
	private int RunsConced;
	public Player (String PlayerName, String PlayerAge, String PlayerType, int NumofWikts, int Totalruns, int Highestscore, String BestBawling, int PlayedMatches, double BattingAvarage, double BawlingAvarage, int TimesOut, int RunsConced){
		this.PlayerName = PlayerName;
		this.PlayerAge = PlayerAge;
		this.PlayerType = PlayerType;
		this.NumofWikts = NumofWikts;
		this.Totalruns= Totalruns;
		this.Highestscore = Highestscore;
		this.BestBawling = BestBawling;
		this.PlayedMatches = PlayedMatches;
		this.BattingAvarage = BattingAvarage;
		this.BawlingAvarage = BawlingAvarage;
		this.TimesOut = TimesOut;
		this.RunsConced = RunsConced;
	}
	void BattingAvarage () {
		
		BattingAvarage = Totalruns/TimesOut;
		System.out.println("Player Batting Avarage: " + PlayerName);
			
		}
		
	void BawlingAvarage () {
		 
		BawlingAvarage = RunsConced/NumofWikts;
		System.out.println("Player Bawling Avarage: " + PlayerName);
		
	}
	
	void playerdetails() {
		
		System.out.println("Player Name: " + PlayerName);
		System.out.println("Player Age: " + PlayerAge);
		System.out.println("Player Type: " + PlayerType);
		
	}
	
	void playerbest() {
		
		System.out.println("Highets Score: " + Highestscore);
		System.out.println("Best Bawling: " + BestBawling);
	
    }

}
