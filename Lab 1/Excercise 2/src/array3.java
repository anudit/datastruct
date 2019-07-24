
public class array3 {
	public static void main(String[] args) {
		
		int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		
		int val = 8;
	    for (int i=0;i<arr.length;i++){
	    	if (arr[i] == val) {
	    		System.out.println(i+1);
	    		break;
	    	}
	    	else if(i+1 == arr.length) {
	    		System.out.println(false);
	    		break;
	    	}
	    }

	}
}
