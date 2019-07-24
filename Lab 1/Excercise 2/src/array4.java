import java.util.Arrays;

public class array4 {
	public static void main(String[] args) {
		
		int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		
		int val = 2;
	    for (int i=0;i<arr.length;i++){
	    	if (arr[i] == val) {
	    		for (int t = i; t<arr.length-1; t++) {
	    			arr[t] = arr[t+1];
	    		}
	    		break;
	    	}
	    	else if(i+1 == arr.length) {
	    		System.out.println(false);
	    		break;
	    	}
	    }
	    
	    for(int j = 0; j < arr.length-1; j++) {
	    	System.out.print(arr[j] + " ");
	    }

	}
}
