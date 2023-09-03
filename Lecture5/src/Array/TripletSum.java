package Array;

public class TripletSum {

	 public static int findTriplet(int[] arr, int x) {
	    	int count=0;
	    	for(int i=0;i<arr.length;i++) {
	    		for(int j=i+1;j<arr.length;j++) {
	    			for(int k=j+1;k<arr.length;k++) {
	    				if(arr[i]+arr[j]+arr[k]==x) {
	    					count++;
	    				}
	    			}
	    		}
	    	}
	    	return count;
	    }
	
	public static void main(String[] args) {
		int[] arr= {2 ,-5 ,8 ,-6 ,0 ,5 ,10 ,11 ,-3 };
		int value=findTriplet(arr,10);
		System.out.println(value);

	}
}
