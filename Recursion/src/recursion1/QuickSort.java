package recursion1;

public class QuickSort {

	public static int partition(int arr[],int low,int high) {
		int pivot=arr[high];
		int i=(low-1);
		
		for(int j=low;j<=high-1;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
	}
	
	public static void quickSort(int[] input,int startIndex, int endIndex) {
		if(startIndex<endIndex) {
			int pi=partition(input,startIndex,endIndex);
			
			quickSort(input,startIndex,pi-1);
			quickSort(input,pi+1,endIndex);
		}
		
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
