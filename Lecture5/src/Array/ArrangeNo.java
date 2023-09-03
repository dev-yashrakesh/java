package Array;

public class ArrangeNo {

	 public static void arrange(int[] arr, int n) {
	    	int i=0;
	        int j=n-1;
	        int num=1;

	        while(i<=j){
	            if(num%2==1){
	                arr[i]=num;
	                i++;
	                num++;
	            }
	            else{
	                arr[j]=num;
	                j--;
	                num++;
	            }
	        }
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
