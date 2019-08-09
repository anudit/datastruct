package exp1;

import java.util.ArrayList;
import java.util.Scanner;
import exp1.Batsmen;

public class experiment1 {
	
	public static void main(String[] args) {

		ArrayList<Batsmen> Scoreboard = new ArrayList<Batsmen>();     
		
		System.out.println("1. Insert a score of a new player. (Name, number of 1s,2s,3s,4s,6s)");
		System.out.println("2. Display scorecard. (display list of top 10 players.)");
		System.out.println("3. Delete a player from scorecard.");
		System.out.println("4. Quit");
		
		int ch = 0;
		while(ch != 4) {
			
			Scanner sc = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			
			System.out.print("Input Choice : ");
			
			try {
				ch  = sc.nextInt();
			}
			catch (Exception e) {
				ch = 0;
			}
			
			if(ch == 1) {
				
				/*
				 * @dev Add Batsmen
				 */
				
//				System.out.print("Enter Name : ");
//				String _name = sc2.nextLine();
//				System.out.print("Enter Ones : ");
//				int _ones = sc.nextInt();
//				System.out.print("Enter Twos : ");
//				int _twos = sc.nextInt();
//				System.out.print("Enter Threes : ");
//				int _threes = sc.nextInt();
//				System.out.print("Enter Fours : ");
//				int _fours = sc.nextInt();
//				System.out.print("Enter Sixes : ");
//				int _sixes = sc.nextInt();
//				
//				Batsmen batter = new Batsmen(_name, _ones, _twos, _threes, _fours, _sixes);
//				Scoreboard.add(batter);
				
				Batsmen b1 = new Batsmen("an1", 1, 2, 3, 2, 1);
				Batsmen b2 = new Batsmen("an2", 3, 6, 3, 2, 1);
				Batsmen b3 = new Batsmen("an3", 2, 1, 1, 2, 10);
				Scoreboard.add(b1);
				Scoreboard.add(b2);
				Scoreboard.add(b3);
				
				System.out.println("Batsmen Recorded");
				
			}
			else if (ch == 2){
				
				/*
				 * @dev Print Sorted Scoreboard
				 */
				
				ArrayList<Batsmen> CleanBoard = new ArrayList<Batsmen>(); 
				
				for (int i = 0; i < Scoreboard.size(); i++) {
					Batsmen b  = new Batsmen(Scoreboard.get(i));
					if( b.name != null ) {
						CleanBoard.add(b);
					}
				}
				
				ArrayList<Batsmen> SortedBoard = new ArrayList<Batsmen>();

				for (int i = 0; i < CleanBoard.size(); i++) {
					
					int max_score = Integer.MIN_VALUE;
					int max_index = -1;
					
					for (int j = 0; j < CleanBoard.size(); j++) {
						Batsmen b  = CleanBoard.get(j);
						if( b.name != null && b.getScore() >= max_score) {
							max_score = b.getScore();
							max_index = j;
						}
					}

					Batsmen topB  = new Batsmen(CleanBoard.get(max_index));
					SortedBoard.add(topB);
					CleanBoard.get(max_index).delete();
					
				}
				
				System.out.println("\n");
				System.out.println(Batsmen.heading("SCOREBOARD"));
				System.out.println(Batsmen.header());
				for (int i = 0; i < SortedBoard.size(); i++) {
					System.out.println(SortedBoard.get(i));
				}
				
				System.out.println("\n");
				
			}
			else if (ch == 3) {
				
				/*
				 * @dev Delete Batsmen
				 */
				
				System.out.print("Enter Name : ");
				String _name = sc2.nextLine();
				Boolean found = false;
				
				for (int i = 0; i < Scoreboard.size() ; i++) {
					
					if(Scoreboard.get(i).name.compareTo( _name ) == 0) {
						Scoreboard.get(i).delete();
						found = true;
						break;
					}
					
				}
				
				if (found) {
					System.out.println("Batsmen Removed");
				}
				else{
					System.out.println("Batsmen Not Found");
				}
				
				
			}
			else if (ch == 4) {
				
				System.out.println("Quitting");
				System.exit(0);
				
			}
			else {
				
				System.out.println("Invalid Choice");
				
			}

		}
		

	}
}