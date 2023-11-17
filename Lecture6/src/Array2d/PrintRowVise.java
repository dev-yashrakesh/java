package Array2d;

import java.util.Scanner;

public class PrintRowVise {

	public static int[] printRowWise(int [][]a) {
		Scanner s=new Scanner(System.in);
		int rows=s.nextInt();
		int cols=s.nextInt();
		
		int arr[][]=new int[rows][cols];
		int arr2[]=new int[rows*cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=s.nextInt();
				arr[i][j]=arr2[j];
			}
		}
		return arr2;
    }
	
	public static void main(String[] args) {
		
		
		
	}

}
