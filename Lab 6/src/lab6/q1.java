package lab6;

import java.util.Scanner;

import lab6.NumberList;

public class q1 {

	public static void main(String[] args) {
		
		System.out.println("### Last in front ###");
		
		NumberList numbers= new NumberList();
		Scanner sc = new Scanner(System.in);
		
		numbers.init();
		
		System.out.println("Original List");
		numbers.print();

		System.out.println("\nReverse List");
		numbers.lastinfront();
		numbers.print();

	}

}
