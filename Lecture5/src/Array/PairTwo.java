package Array;

public class PairTwo {

	public static int pairSum(int arr[], int x) {
		int count=0;
    	for(int i=0;i<arr.length;i++) {
    		
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[i]+arr[j]==x) {
    				count++;
    			}
    		}
    	}
		return count;
    }
	
	public static void main(String[] args) {
		int[] arr= {2 ,8 ,10 ,5 ,-2 ,5};
		int value=pairSum(arr,10);
		System.out.println(value);

	}

}
