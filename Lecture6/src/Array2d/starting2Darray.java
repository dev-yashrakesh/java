package Array2d;

import java.util.Scanner;

public class starting2Darray {

	public static void main(String[] args) {
//		int arr1[][]=new int[7][9];
//		arr1[1][2]=14;
//		System.out.println(arr1[1][2]);
//		
//		int arr2[][]= {{1,2,3},{2,3,4}};
//		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows ");
		int rows=s.nextInt();
		System.out.println("Enter number of column ");
		int cols=s.nextInt();
		
		int arr[][]=new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter element at "+i+"Row "+j+"Column ");
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
