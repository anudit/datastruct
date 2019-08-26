package lab6;

import lab6.NumberList;

public class q2 {

	public static void main(String[] args) {
		
		System.out.println("### Intersection ###");
		
		NumberList numbers1 = new NumberList();
		NumberList numbers2 = new NumberList();

		numbers1.init();
		numbers2.init();

		System.out.println("List1");
		numbers1.print();
		System.out.println("\nList2");
		numbers2.print();
		
		System.out.println("\nJoined List");
		NumberList joined = new NumberList(NumberList.Intersection(numbers1, numbers2));
		joined.print();
	}

}
