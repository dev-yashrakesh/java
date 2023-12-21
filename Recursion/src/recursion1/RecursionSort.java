package recursion1;

public class RecursionSort {
 
	public static boolean checkSorted(int[] arr) {
		if(arr.length<=1) {
			return true;
		}
		int small[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			small[i-1]=arr[i];
		}
		boolean check=checkSorted(small);
		
		if(!check) {
			return false;
		}
		if(arr[0]<arr[1]) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean checkSorted_2(int[] arr) {
		if(arr.length<=1) {
			return true;
		}
		if(arr[0]>arr[1]) {
			return false;
		}
		int[] small=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			small[i-1]=arr[i];
		}
		boolean ans=checkSorted_2(small);
		return ans;
	}
	
	public static boolean checkSortedBetter(int[] arr,int startIndex) {
		if(startIndex>=arr.length-1) {
			return true;
		}
		if(arr[startIndex]>arr[startIndex+1]) {
			return false;
		}
		boolean check=checkSortedBetter(arr,startIndex+1);
		return check;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,1};
		System.out.println(checkSorted(arr));
		System.out.println(checkSorted_2(arr));
		System.out.println(checkSortedBetter(arr,0));

	}

}
