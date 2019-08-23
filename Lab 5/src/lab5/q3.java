package lab5;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		
		NumberList numbers= new NumberList();
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println("### Print Unique Nodes ###");
		
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
		numbers = numbers.unique(numbers);
		System.out.println("Unique List");
		numbers.print(numbers);

	}

}
