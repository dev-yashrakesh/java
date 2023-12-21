package recursion1;

public class ReturnAllIndices {

	public static int[] allIndexes(int input[], int x) {
		return allIndexes(input,x,0);
		
	}
	
	private static int[] allIndexes(int input[],int x,int startIndex) {
		if(startIndex==input.length) {
			int[] output=new int[0];
			return output;
		}
		int[] smallAns=allIndexes(input,x,startIndex+1);
		if(input[startIndex]==x) {
			int[] ans=new int[smallAns.length+1];
			ans[0]=startIndex;
			for(int i=0;i<smallAns.length;i++) {
				ans[i+1]=smallAns[i];
			}
			return ans;
		}
		return smallAns;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
