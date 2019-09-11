package lab4;
import java.util.Scanner;

import lab4.Flights;

public class q1 {
	
	public static void main(String[] args) { 
		
		Flights airline= new Flights();
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Enter number of Flights: ");
		int _fcnt = sc.nextInt();
		
		while ( _fcnt != 0 ) {
			System.out.print("Enter Flight Number : ");
			String _fno = sc2.nextLine();
			airline = airline.addFlight(airline, _fno);
			
			_fcnt--;
		}

		System.out.println("1. Book reservations");
		System.out.println("2. Cancel reservations");
		System.out.println("3. Printing passenger names");
		System.out.println("4. Print number of passengers");
		System.out.println("5. Quit");
			
		int ch = 0;
		while(ch != 5) {

			System.out.print("Input Choice : ");
			
			try {
				ch  = sc.nextInt();
			}
			catch (Exception e) {
				ch = 0;
			}
			
			if (ch == 1) {
				
				/*
				 * @dev Add n Number of Passengers to a Flight
				 */
				
				System.out.print("Enter Flight Number : ");
				String _fno = sc2.nextLine();
				
				if(airline.isFlight(airline, _fno) == true) {
					
					System.out.print("Enter Number of Passengers: ");
					int _pcnt = sc.nextInt();
					while ( _pcnt != 0 ) {
						
						System.out.print("Enter Passenger Name : ");
						String _pname = sc2.nextLine();
						airline.getFlight(airline, _fno).addPassenger(_pname);
						_pcnt--;
						
					}
					
				}
				else {
					System.out.println("Invalid Flight Number");
				}
				
			}
			else if (ch == 2) {
				
				/*
				 * @dev Remove n Number of Passengers to a Flight
				 */
				
				System.out.print("Enter Flight Number : ");
				String _fno = sc2.nextLine();
				
				if(airline.isFlight(airline, _fno) == true) {
					
					System.out.print("Enter Number of Passengers: ");
					int _pcnt = sc.nextInt();
					while ( _pcnt != 0 ) {
						
						System.out.print("Enter Passenger Name : ");
						String _pname = sc2.nextLine();
						airline.getFlight(airline, _fno).removePassenger(_pname);
						_pcnt--;
						
					}
					
				}
				else {
					System.out.println("Invalid Flight Number");
				}
				
			}
			else if (ch == 3) {
				
				/*
				 * @dev Print Specific Flight Passenger Details
				 */
				
				System.out.print("Enter Flight Number : ");
				String _fno = sc2.nextLine();
				
				if(airline.isFlight(airline, _fno) == true) {
					Passengers ps = airline.getFlight(airline, _fno).getPassengers();
					ps.print(ps);
				}
				else {
					System.out.println("Invalid Flight Number");
				}
				
			}
			else if (ch == 4) {
				
				/*
				 * @dev Print Specific Flight Passenger Count
				 */
				
				System.out.print("Enter Flight Number : ");
				String _fno = sc2.nextLine();
				
				if(airline.isFlight(airline, _fno) == true) {
					System.out.println(airline.getFlight(airline, _fno).getPassengers().total);
				}
				else {
					System.out.println("Invalid Flight Number");
				}
				
			}
			else if (ch == 5) {
				
				System.out.println("Quitting");
				System.exit(0);
				
			}
			else {
				
				System.out.println("Invalid Choice");
				
			}
		}

	 } 
	
}
