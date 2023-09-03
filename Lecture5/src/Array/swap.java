package Array;

public class swap {

	public static void swapAlternate(int arr[]) {
    	int size=arr.length;
    	
    		for(int i=0;i<size;i=i+2) {
    		if(i==size-1 && i%2==0) {
    			break;
    		}
    		int temp=arr[i];
    		arr[i]=arr[i+1];
    		arr[i+1]=temp;
    		
    	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
