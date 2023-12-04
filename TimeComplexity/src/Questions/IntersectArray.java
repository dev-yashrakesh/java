package Questions;

import java.util.Arrays;

public class IntersectArray {

	public static void intersection(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        merge(arr1,arr2);

        }
     private static void merge(int arr1[] ,int arr2[]){
        int i=0,j=0;
        
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
