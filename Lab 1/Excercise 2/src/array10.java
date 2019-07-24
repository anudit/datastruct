
public class array10 {
	static boolean isArm(int n) { 
		int c=0,a,temp=n;
	    
	    while(n>0)  {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    	return true;
	    else  
	    	return false;
	   }
    
	public static void main(String[] args)  {  
		  
		int cnt = 0;
		
		for(int i=0; cnt<=10; i++) {
			if (isArm(i) == true) {
				System.out.println(i);
				cnt+=1;
			}
				
		}
		
	}
}
