
public class Question3 {
	public static void main(String[] args) {
		int height = 9;
	    for (int i=1;i<=height;i++){
            int st_cnt = (2*i - 1);
            int sp_cnt = ((2*height - 1) - st_cnt)/2;
            while(sp_cnt != 0){
                System.out.print(" ");
                sp_cnt--;
            }
            while(st_cnt != 0){
                System.out.print("*");
                st_cnt--;
            }
	        System.out.print("\n");
	    }
	    for (int i=height-1;i>=1;i--){
	    	int st_cnt = (2*i - 1);
            int sp_cnt = ((2*height - 1) - st_cnt)/2;
            while(sp_cnt != 0){
                System.out.print(" ");
                sp_cnt--;
            }
            while(st_cnt != 0){
                System.out.print("*");
                st_cnt--;
            }
            System.out.print("\n");
	    }
	}
}
