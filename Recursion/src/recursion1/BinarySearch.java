package recursion1;

public class BinarySearch {

	public static int search(int []nums, int target,int start,int end) {
        if(start>end) {
        	return -1;
        }
        int mid=(start+end)/2;
        if(nums[mid]==target) {
        	return mid;
        }
        else if(nums[mid]>target) {
        	return search(nums,target,start,mid-1);
        }
        else {
        	return search(nums,target,mid+1,end);
        }
    }
	
	public static int search(int []nums, int target) {
        return search(nums,target,0,nums.length-1);
    }
	
	public static void main(String[] args) {
		int n1[]= {1,2,3,4,5,6,7,8,9};
		int ans=search(n1,3);
		System.out.println(ans);
	}

}
