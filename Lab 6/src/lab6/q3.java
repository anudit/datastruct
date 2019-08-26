package lab6;

public class q3 {

	public static void main(String[] args) {
		
		System.out.println("### Identical ###");
		
		NumberList numbers1 = new NumberList();
		NumberList numbers2 = new NumberList();

		numbers1.init();
		numbers2.init();

		System.out.println("List1");
		numbers1.print();
		System.out.println("\nList2");
		numbers2.print();
		
		System.out.println(numbers1.isSameAs(numbers2));
		
	}

}
