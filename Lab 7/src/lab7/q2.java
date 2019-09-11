package lab7;

import lab7.StackList;

public class q2 {

	public static void main(String[] args) {
		StackList obj = new StackList(); 

        obj.push(11); 
        obj.push(22); 
        obj.push(33); 
        obj.push(44); 

        obj.display(); 

        System.out.printf("\nTop element is %d\n", obj.peek()); 

        obj.pop(); 
        obj.pop(); 

        obj.display(); 

        System.out.printf("\nTop element is %d\n", obj.peek()); 

	}

}
