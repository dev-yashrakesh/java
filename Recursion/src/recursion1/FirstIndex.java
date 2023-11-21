package recursion1;

public class FirstIndex {

	public static int firstIndex(int input[], int x,int startIndex) {
		
		if(startIndex>input.length-1) {
			return -1;
		}
		if(input[startIndex]==x) {
			return startIndex;
		}
		int ans=firstIndex(input,x,startIndex+1);
		return ans;
	}
	
	public static int firstIndex(int input[], int x) {
		
		return firstIndex(input,x,0);
	}
	
	public static void main(String[] args) {
		int[] n1= {1,2,3,2,4,5,6};
		int ans=firstIndex(n1,2);
		System.out.println(ans);

	}

}
