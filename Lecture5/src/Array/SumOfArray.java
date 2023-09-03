package Array;
import java.util.Scanner;
public class SumOfArray {

//	public static int[] arr() {
//		Scanner s= new Scanner(System.in);
//		int t=s.nextInt();
//		
//		for(int i=1;i<=t;i++) {
//			int N=s.nextInt();
//			int arr1[]=new int[N];
//			for(int j=0;j<N;j++) {
//				arr1[i]=s.nextInt();
//			}
//			return arr1;
//	}
//		
//}
	
	public static int sum(int[] arr) {
		int size=arr.length;
		int sum1=0;
		for(int i=0;i<size;i++) {
			sum1=sum1+arr[i];
		}
		return sum1;
	}
	
	public static void main(String[] args) {
		

	}

}
