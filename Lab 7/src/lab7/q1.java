package lab7;
import lab7.StackArray;

public class q1 {
	

	public static void main(String[] args) {
		StackArray<Integer> stack = new StackArray<>();
		 
		System.out.println( stack.isEmpty() );
		
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println( stack.isEmpty() );
         
        System.out.println(stack);
         
        System.out.println( stack.pop() );
        System.out.println( stack.pop() );
        System.out.println( stack.peak() );
        System.out.println( stack.pop() );
         
        System.out.println( stack );
	}

}
