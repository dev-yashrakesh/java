package SortingAndSearching;

public class BinarySearch {

	 public static int search(int []nums, int target) {
		 int end=nums.length-1;
		 int start=0;
	       while(start<=end) {
	    	   int mid=(start+end)/2;
	    	   
	    	   if(target==nums[mid]) {
	    		   return mid;
	    	   }
	    	   else if(target>nums[mid]) {
	    		   start=mid+1;
	    	   }
	    	   else {
	    		   end=mid-1;
	    	   }
	       }
	       return -1;
	    }
	
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7,8,9};
		int value=search(nums,5);
		System.out.println(value);

	}

}
