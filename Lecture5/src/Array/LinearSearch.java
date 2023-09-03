package Array;
import java.util.Scanner;
public class LinearSearch {

	 public static int linearSearch(int arr[], int x) {
			int number=-1;
		 	int size=arr.length;
			for(int i=0;i<size;i++) {
				if(x==arr[i]) {
					number=i;
				}
			}return number;
	    }
	
	public static void main(String[] args) {
		
	}

}
