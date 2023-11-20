package recursion1;

public class MergeSort {

	public class Solution {

//		public static void mergeSort(int[] arr, int l, int r){
//			if(l<r){
//				int mid=(l+r)/2;
//		        mergeSort(arr,l,mid);
//		        mergeSort(arr,mid+1,r);
//		        merge(arr,l,r);
//			}
//		}
			
//			public static void merge(int[] array,int left,int right) {
//				int middle = (left+right)/2;
//				int n1 = middle - left + 1;
//		        int n2 = right - middle;
//		        int[] leftArray = new int[n1];
//		        int[] rightArray = new int[n2];
//		        System.arraycopy(array, left, leftArray, 0, n1);
//		        System.arraycopy(array, middle + 1, rightArray, 0, n2);
//
//		    
//		        int i = 0, j = 0;
//
//		        int k = left;
//
//		        while (i < n1 && j < n2) {
//		            if (leftArray[i] <= rightArray[j]) {
//		                array[k] = leftArray[i];
//		                i++;
//		            } else {
//		                array[k] = rightArray[j];
//		                j++;
//		            }
//		            k++;
//		        }
//		        while (i < n1) {
//		            array[k] = leftArray[i];
//		            i++;
//		            k++;
//		        }
//		        while (j < n2) {
//		            array[k] = rightArray[j];
//		            j++;
//		            k++;
//		        }
//
//			}
//			
//		}

		
		
		 public static void mergeSort(int[] arr, int l, int r){
		       if(l<r) {
		    	   int m=l+(r-1)/2;
		    	   mergeSort(arr,l,m);
		    	   mergeSort(arr,m+1,r);
		    	   
		    	   merge(arr,l,m,r);
		    	   }
		       
		       }
public static void merge(int arr[],int l,int m,int r) {
	int n1=m-l+1;
	int n2=r-m;
	
	int arr1[]=new int[n1];
	int arr2[]=new int[n2];
	
	for(int i=0;i<n1;i++) {
		arr1[i]=arr[l+i];
	}
	for(int j=0;j<n2;j++) {
		arr2[j]=arr[m+1+j];
	}
	
	int i=0,j=0,k=l;
	while(i<n1&&j<n2) {
		if(arr1[i]<arr2[j]) {
			arr[k]=arr1[i];
			i++;
			k++;
		}
		else {
			arr[k]=arr2[j];
			j++;
			k++;
		}
	}
	while(i<n1) {
		arr[k]=arr1[i];
		i++;
		k++;
	}
	while(j<n2) {
		arr[k]=arr2[j];
		k++;
		j++;
	}
}
		    
	
	public static void main(String[] args) {
		;

	}
}

	

}
