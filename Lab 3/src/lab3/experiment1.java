package lab3;

import java.util.ArrayList;
import lab3.Batsmen;
import java.util.Scanner; 

public class experiment1 {
	
	public static void displayScoreboard (ArrayList<Batsmen> sb) {
		System.out.println("Scoreboard");
		for (int i = 0 ; i<sb.size(); i++) {
			System.out.println("hi");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Batsmen> Scoreboard = new ArrayList<Batsmen>();     
		
		int ch = 0;
		while(ch != 4) {
			System.out.println("1. Insert a score of a new player. (Name, number of 1s,2s,3s,4s,6s)");
			System.out.println("2. Display scorecard. (display list of top 10 players.)");
			System.out.println("3. Delete a player from scorecard.");
			System.out.println("4. Quit");
			System.out.println("Input Choice : ");
			
			ch  = sc.nextInt();
		
			if(ch == 1) {
				
				System.out.println("Enter Name : ");
				String _name = sc.nextLine();
				System.out.println("Enter Ones : ");
				int _ones = Integer.valueOf(sc.nextInt());
				System.out.println("Enter Twos : ");
				int _twos = sc.nextInt();
				System.out.println("Enter Threes : ");
				int _threes = sc.nextInt();
				System.out.println("Enter Fours : ");
				int _fours = sc.nextInt();
				System.out.println("Enter Sixes : ");
				int _sixes = sc.nextInt();
				
				Batsmen batter = new Batsmen(_name, _ones, _twos, _threes, _fours, _sixes);
				Scoreboard.add(batter);
				
				System.out.println("Batsmen Recorded");
				
			}
			else if (ch == 2){
				
				displayScoreboard(Scoreboard);
				
			}
			else if (ch == 3){
				
				System.out.println("Enter Name : ");
				String _name = sc.nextLine();

				System.out.println("Batsmen Removed");
				
			}
			else if (ch == 4){
				
				System.out.println("Quitting");
					
			}
			else {
				System.out.println("Invalid Choice");
			}

		}
		System.exit(0);

	}
}