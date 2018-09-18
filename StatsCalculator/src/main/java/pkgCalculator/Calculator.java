package pkgCalculator;
import java.util.Scanner;

public class Calculator {
	Scanner input = new Scanner(System.in);
	private double atBats;
	private double hits;
	private double doubles;
	private double triples;
	private double homeRuns;
	private double runs;
	private double walks;
	private double singles;
	private double battingAverage;
	private double totalBases;
	private double onBasePercent;
	private double sluggingPercent;
	private double onBaseSlugging;
	

	public void singlesCalculator () {
		this.singles = (this.hits - (this.doubles + this.triples + this.homeRuns));
	}
	
	public void battingAverageCalculator () {
		this.battingAverage = (this.hits/this.atBats);
	}
	
	public void totalBasesCalculator () {
		this.totalBases = (this.singles + (this.doubles*2) + (this.triples*3) + (this.homeRuns*4));
	}
	
	public void onBasePercentCalculator (){
		this.onBasePercent = ((this.hits+this.walks)/(this.atBats+this.walks));
	}
	
	public void sluggingPercentCalculator () {
		this.sluggingPercent = (this.totalBases/this.atBats);
	}
	public void onBaseSluggingCalculator () {
		this.onBaseSlugging = this.onBasePercent + this.sluggingPercent; 
	}
	
	public Calculator () {
		//Asks user for input
		System.out.print("Enter Player's At Bats(AB):");
		int atBats = input.nextInt();
		System.out.print("Enter Player's Hits(H):");
		int hits = input.nextInt();
		System.out.print("Enter Player's Doubles(2B):");
		int doubles = input.nextInt();
		System.out.print("Enter Player's Triples(3B):");
		int triples = input.nextInt();
		System.out.print("Enter Player's Home Runs(HR):");
		int homeRuns = input.nextInt();
		System.out.print("Enter Player's Runs(R):");
		int runs = input.nextInt();
		System.out.print("Enter Player's Walks(BB):");
		int walks = input.nextInt();
		
		//Calculates stats based on input values
		singlesCalculator();
		battingAverageCalculator();
		totalBasesCalculator();
		onBasePercentCalculator();
		sluggingPercentCalculator();
		onBaseSluggingCalculator();
		
		//Prints stats
		System.out.printf("The player's stats are as follows: \n Batting Average(BA): %f \n Total Bases(TB): %f \n On Base Percent(OBP): %f \n Slugging Percent(SLG): %f \n On Base + Slugging(OBS): %f \n", battingAverage, totalBases, onBasePercent, sluggingPercent, onBaseSlugging);
	}
}
