
public class array5 {
	public static void main(String[] args) {
		
		int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

		int ind = 2;
		int newValue = 5;
		
		for(int j = 0; j < arr.length-1; j++) {
	    	System.out.print(arr[j] + " ");
	    }
		System.out.print("\n");
		
		
		for(int i = arr.length -1 ; i > ind ; i--){
			arr[i] = arr[i-1];
		}
		
		arr[ind] = newValue;
		
		for(int j = 0; j < arr.length-1; j++) {
	    	System.out.print(arr[j] + " ");
	    }
		
	}
}
