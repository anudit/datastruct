package lab;

import java.util.Scanner;

import lab.tree;

public class q1 {

    public static void main(String[] args) {
    	
    	System.out.println("P) Print");
		System.out.println("I) Insert");
		System.out.println("Q) Quit"); 
		
		tree bst = new tree();

		String ch = "";
		while(ch != "Q") { 
			
			Scanner sc = new Scanner(System.in); // string
			Scanner sc2 = new Scanner(System.in); //int
			System.out.print("Input Choice : ");
		
			ch  = sc.nextLine();
			
			if (ch.compareTo("P") == 0) {
				bst.print();
			}
			else if (ch.compareTo("I") == 0) {
				System.out.print("Input Name : ");
				String name  = sc.nextLine();
				System.out.print("Input Age : ");
				int age  = sc2.nextInt();
				bst.insert(name, age);
			}
			else if (ch.compareTo("Q") == 0) {
				System.out.println("Quitting");
				System.exit(0);
			}
			else {
				System.out.println("Invalid Choice");
			}
		}

    }
}