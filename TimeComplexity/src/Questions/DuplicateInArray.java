package Questions;

import java.util.Arrays;

public class DuplicateInArray {

	public static int findDuplicate(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[i+1]) {
				return arr[i];
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] ans= {2,2,6,4,3,1};
		int arr=findDuplicate(ans);
		System.out.println(arr);

	}

}
