package lab5;

import java.util.Scanner;
import lab5.NumberList;

public class q1 {
	
	public static void main(String[] args) {
		
		System.out.println("### Value at nth from end ###");
		
		NumberList numbers= new NumberList();
		Scanner sc = new Scanner(System.in);
		numbers.init();
		
		System.out.print("Enter n : ");
		int _index = sc.nextInt();
		
		numbers.print();
		System.out.print("\nnth from end : ");
		System.out.println(numbers.getNumberByIndex(_index, true));
		
	}
	
}
