package SortingAndSearching;

public class CountSmall {

	 public static int[] countS(int n, int m, int []a, int []b) {
		 int[] result=new int[n];
	        for(int i=0;i<n;i++) {
	        	int ans=0;
	        	for(int j=0;j<m;j++) {
	        		if(b[j]<=a[i]) {
	        			ans++;
	        			result[i]=ans;
	        		}
	        	}
	        	
	        }
	         return result;
	    }
	
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,1};
		int b[]= {3,2,1,3,4,5,2};
		
		

	}

}
