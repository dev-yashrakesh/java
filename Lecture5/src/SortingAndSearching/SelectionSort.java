package SortingAndSearching;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
        	int min=arr[i];
        	int minIndex=i;
        	for(int j=i+1;j<arr.length;j++) {
        		if(min>arr[j]) {
        			min=arr[j];
        			minIndex=j;
        		}
        	}
        	if(minIndex!=i) {
        		arr[minIndex]=arr[i];
        		arr[i]=min;
        	}
        }
    }
	
	public static void main(String[] args) {
		int[] arr= {5,6,3,4,7,1,2,8,0,0};
		 selectionSort(arr);
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }

	}

}
