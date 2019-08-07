package Excercise2;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class question1 {
	
	public static void main(String[] args) {
		Random rand = new Random(); 
		
		System.out.println("Enter cnt");
		Scanner sc = new Scanner(System.in);
		
	    int candidates = sc.nextInt();
	    
	    int[] ratings = new int[candidates];
	    
	    for(int i=0; i < candidates; i++) {
	    	System.out.println("Enter Number : ");
	    	ratings[i] = sc.nextInt();
	    }
	    System.out.println(Arrays.toString(ratings));
	    
	    for(int i=0; i < candidates; i++) {
	    	if (ratings[i] == 0 && i!=0)
	    		ratings[i-1] = 0;
	    }
	    
	    int sum = 0;
	    for(int i=0; i < candidates; i++) {
	    	sum+=ratings[i];
	    }
	    
	    System.out.println(Arrays.toString(ratings));
	    System.out.println(sum);
	}
  
}
