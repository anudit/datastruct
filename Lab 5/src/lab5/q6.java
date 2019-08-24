package lab5;

import java.util.Scanner;

public class q6 {
	
	public static void main(String[] args) {
		
		System.out.println("### Reverse List ###");
		
		NumberList numbers= new NumberList();
		Scanner sc = new Scanner(System.in);
		
		numbers.init();
		
		System.out.println("Original List");
		numbers.print();

		System.out.println("\nReverse List");
		numbers.reverse();
		numbers.print();
	}
	
}
