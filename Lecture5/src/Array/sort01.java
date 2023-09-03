package Array;

public class sort01 {

	 public static void sortZeroesAndOne(int[] arr) {
		 int countZero=0;
	    	for(int i=0;i<arr.length;i++) {
	    		if(arr[i]==0) {
	    			int temp=arr[countZero];
	    			arr[countZero]=arr[i];
	    			arr[i]=temp;
	    			countZero+=1;
	    		}
	    		
	    	}
	    	
	    }
	
	public static void main(String[] args) {
		int[] arr= {1,0,1,0,1,1,1,0,0};
		sortZeroesAndOne(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
