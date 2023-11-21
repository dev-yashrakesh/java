package recursion1;

public class LastIndex {

	public static int lastIndex(int input[], int x,int startIndex) {
		if(startIndex<0) {
			return -1;
		}
		if(input[startIndex]==x) {
			return startIndex;
		}
		int ans=lastIndex(input,x,startIndex-1);
		return ans;
	}
	
	public static int lastIndex(int input[], int x) {
		int n=input.length-1;
		return lastIndex(input,x,n);
	}
	
	public static void main(String[] args) {
		int[] n1= {1,2,3,2,4,5,6};
		int ans=lastIndex(n1,2);
		System.out.println(ans);


	}

}
