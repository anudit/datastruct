package lab5;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		
		NumberList numbers1 = new NumberList();
		NumberList numbers2 = new NumberList();
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println("### Print Unique Nodes ###");
		
		int inpCnt = 0;
		System.out.print("Enter the Number of Nodes in List 1: ");
		inpCnt = sc.nextInt();
		
		while (inpCnt != 0) {
			System.out.print("Enter Number : ");
			int _num = sc.nextInt();
			numbers1.addNumber(numbers1, _num);
			inpCnt--;
		}
		
		inpCnt = 0;
		System.out.print("Enter the Number of Nodes in List 2: ");
		inpCnt = sc.nextInt();
		
		while (inpCnt != 0) {
			System.out.print("Enter Number : ");
			int _num = sc.nextInt();
			numbers2.addNumber(numbers2, _num);
			inpCnt--;
		}
		
		System.out.println("List1");
		numbers1.print(numbers1);
		System.out.println("\nList2");
		numbers1.print(numbers2);
		NumberList numbersJoined = new NumberList();
		numbersJoined = numbersJoined.join(numbers1, numbers2);
		System.out.println("\nJoined List");
		numbersJoined.print(numbersJoined);

	}
}
