
public class array8 {

	public static void main(String[] args) {
		int[] arr = new int[]{ 7,2,3,7,5,6,7,8,9,10 };
		
	    for (int i=0;i<arr.length;i++){
	    	if (arr[i] == 0 || arr[i] == 1) {
	    		System.out.println(false);
	    		break;
	    	}
	    	else if(i+1 == arr.length) {
	    		System.out.println(false);
	    		break;
	    	}	
	    }
	}

}
