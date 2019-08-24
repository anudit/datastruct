package lab5;

import java.util.Scanner;
import lab5.NumberList; 
import lab5.NumberList.Number; 

public class q5 {

	public static void main(String[] args) {

		System.out.println("### Exchange Nodes ###");
		
		NumberList numbers= new NumberList();
		Scanner sc = new Scanner(System.in);
		numbers.init();
		
		System.out.print("Enter 1st Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd Number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Original List");
		numbers.print();

		System.out.println("\nSwapped List");
		numbers.swap(num1, num2);
		numbers.print();
	}

}
