
public class array9 {
	static int fib(int n) { 
		if (n <= 1) 
			return n; 
    	return fib(n-1) + fib(n-2); 
    }
	static int fact(int n){
		int out;
	    if(n==1){
	    	return 1;
	    }
	    out = fact(n-1)* n;
	    return out;
	}
       
    public static void main (String args[]) { 
    	int n = 9; 
    	System.out.println(fib(n));
    	System.out.println(fact(n));
    }

}
