package Questions;

public class TripletSum {

	public static int tripletSum(int[] arr, int num) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==num) {
						c++;
					}
				}
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
