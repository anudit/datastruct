package lab8;
import java.util.Scanner;

import lab8.DoublyLinkedList;
public class q1 {

    public static void main(String args[]) { 
    	
    		DoublyLinkedList list = new DoublyLinkedList();
    		
    		System.out.println("1. Print");
    		System.out.println("2. Insert");
    		System.out.println("3. Delete");
    		System.out.println("4. Quit");
  
    		int ch = 0;
    		while(ch != 4) {
    			
    			Scanner sc = new Scanner(System.in);
    			System.out.print("Input Choice : ");
    			
    			try {
    				ch  = sc.nextInt();
    			}
    			catch (Exception e) {
    				ch = 0;
    			}
    			
    			if (ch == 1) {
    				list.print();
    			}
    			else if (ch == 2) {
    				System.out.print("Input Number to add : ");
    				int num  = sc.nextInt();
    				list.insert(num);
    			}
    			else if (ch == 3) {
    				System.out.print("Input Number to find: ");
    				int num  = sc.nextInt();
    				list.delete(num);
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
