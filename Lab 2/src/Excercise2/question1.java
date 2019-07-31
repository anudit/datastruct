package Excercise2;

import java.util.Random;
import java.util.Arrays;

public class question1 {
	
	public static void main(String[] args) {
		Random rand = new Random(); 
		
	    int candidates = 10;
	    int[] ratings = new int[candidates];
	    
	    for(int i=0; i < candidates; i++) {
	    	ratings[i] = rand.nextInt(11);
	    }
	    System.out.println(Arrays.toString(ratings));
	    
	    for(int i=0; i < candidates; i++) {
	    	if (ratings[i] == 0 && i!=0)
	    		ratings[i-1] =0;
	    }
	    
	    int sum = 0;
	    for(int i=0; i < candidates; i++) {
	    	sum+=ratings[i];
	    }
	    
	    System.out.println(Arrays.toString(ratings));
	    System.out.println(sum);
	}
  
}
