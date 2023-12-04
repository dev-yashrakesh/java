package Questions;

import java.util.Arrays;

public class FindTheUniqueElement {

	public static int findUnique(int[] arr){
	    int ans=arr[0];
	    for(int  i=1;i<arr.length;i++)
	    {
	        ans=ans^arr[i];
	    }
	    return ans;
	}
	
	public static void main(String[] args) {
		int[] ans= {4,4,1,1,5,5};
		int arr=findUnique(ans);
		System.out.println(arr);
	}

}
