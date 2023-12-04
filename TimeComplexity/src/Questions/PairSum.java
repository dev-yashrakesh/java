package Questions;

public class PairSum {

	public static int pairSum(int[] arr, int num) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==num) {
					c++;
				}
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,4};
		int ans=pairSum(arr,8);
		System.out.println(ans);

	}

}
