package lab6;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		
		System.out.println("### Reverse Pyramid ###");
		
		NumberList numbers= new NumberList();
		Scanner sc = new Scanner(System.in);
		
		numbers.init();
		
		System.out.println("Original List");
		numbers.print();

		System.out.println("\nReverse Pyramid");
		numbers.remGreater();
		numbers.print();

	}

}
