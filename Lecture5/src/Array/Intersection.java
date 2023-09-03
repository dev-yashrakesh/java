package Array;

public class Intersection {

	public static void intersections(int arr1[], int arr2[]) {
		

	    int n1= arr1.length;
		int n2= arr2.length;

		for(int i=0; i<n1;i++)
		{

			 for(int j=0; j<n2;j++)
			 {
				  if(arr1[i]==arr2[j])
				  {
					   System.out.print(arr1[i]+" ");
					   arr2[j]=Integer.MIN_VALUE;
					   break;
				  }
			 }

		}
    }
    			
   
	
	public static void main(String[] args) {
		int arr2[]= {1,2,3,4,5,6,7};
		int arr1[]= {4,5,6,7,8,9,10};
		
		intersections(arr1,arr2);

	}

}
