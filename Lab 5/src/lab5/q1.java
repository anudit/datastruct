package lab5;

import java.util.Scanner;

import lab5.NumberList;

public class q1 {
	
	public static void main(String[] args) {
		
		NumberList numbers= new NumberList();
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println("### Value at nth from end ###");
		
		int inpCnt = 0;
		System.out.print("Enter the Number of Nodes : ");
		inpCnt = sc.nextInt();
		
		while (inpCnt != 0) {
			System.out.print("Enter Number : ");
			int _num = sc.nextInt();
			numbers.addNumber(numbers, _num);
			inpCnt--;
		}
		
		System.out.print("Enter n : ");
		int _index = sc.nextInt();
		
		numbers.print(numbers);
		System.out.print("\nnth from end : ");
		System.out.println(numbers.getNumberByIndex(numbers, _index, true));
		
	}
	
}
