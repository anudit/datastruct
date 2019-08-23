package lab5;

import java.util.Scanner;

import lab5.NumberList;

public class q2 {
	
	public static void main(String[] args) {
		
		NumberList numbers= new NumberList();
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println("### Print Alternate Nodes ###");
		
		int inpCnt = 0;
		System.out.print("Enter the Number of Nodes : ");
		inpCnt = sc.nextInt();
		
		while (inpCnt != 0) {
			System.out.print("Enter Number : ");
			int _num = sc.nextInt();
			numbers.addNumber(numbers, _num);
			inpCnt--;
		}
		
		System.out.println("Original List");
		numbers.print(numbers);
		System.out.println("");
		System.out.println("List with Alternate Nodes");
		numbers.print(numbers, 1);
		
	}
	
}
