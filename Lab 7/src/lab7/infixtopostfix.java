package lab7;
import java.util.Scanner;
import java.util.Stack; 
  
class infixtopostfix  { 

    static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 

    static String convert(String exp) { 

        String result = new String(""); 
        Stack<Character> stack = new Stack<>(); 
          
        for (int i = 0; i<exp.length(); ++i) 
        { 
            char c = exp.charAt(i); 
            if (Character.isLetterOrDigit(c)) 
                result += c; 

            else if (c == '(') 
                stack.push(c); 

            else if (c == ')') 
            { 
                while (!stack.isEmpty() && stack.peek() != '(') 
                    result += stack.pop(); 
                  
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Invalid Expression";               
                else
                    stack.pop(); 
            } 
            else 
            { 
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){ 
                    if(stack.peek() == '(') 
                        return "Invalid Expression"; 
                    result += stack.pop(); 
             } 
                stack.push(c); 
            } 
       
        } 

        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
            result += stack.pop(); 
         } 
        return result; 
    } 

    public static void main(String[] args)  
    { 
    	String exp; 
		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter a Expression : "); 
 		exp = sc.nextLine();
//        String exp = "a+b*(c^d-e)^(f+g*h)-i"; 
 		System.out.print("Result : "); 
        System.out.print(convert(exp)); 
    } 
}