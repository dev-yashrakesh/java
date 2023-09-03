package Array;

public class duplicate {

	public static int duplicateNumber(int arr[]) {
    	int size=arr.length;
    	for(int i=0;i<size;i++) {
    		int c=0;
    		for(int j=0;j<size;j++) {
    			if(arr[i]==arr[j]) {
    				c++;
    			}
    		}
    		if(c>=2) {
    			return arr[i];
    		}
    	}return Integer.MAX_VALUE;
    }
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4};
		int value=duplicateNumber(arr);
		System.out.println(value);

	}

}
