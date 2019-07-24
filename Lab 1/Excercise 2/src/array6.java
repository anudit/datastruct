
public class array6 {
	public static void main(String[] args) {
		
		int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		int min  = 99999;
		int max = -99999;
		
		for (int i=0;i<arr.length;i++){
	    	if (arr[i] > max) {
	    		max = arr[i];
	    	}
	    	if (arr[i] < min) {
	    		min = arr[i];
	    	}
	    }
		System.out.println("MIN : "+min);
		System.out.println("MAX : "+max);
	}
}
