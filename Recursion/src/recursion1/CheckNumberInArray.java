package recursion1;

public class CheckNumberInArray {

	public static boolean checkNumber(int input[], int x,int startIndex) {
		
		if(startIndex>input.length-1) {
			return false;
		}
		if(input[startIndex]==x) {
			return true;
		}
		boolean ans=checkNumber(input,x,startIndex+1);
		return ans;
	}
	public static boolean checkNumber(int input[], int x) {
		return checkNumber(input,x,0);
	}
		
	
	
	
	public static void main(String[] args) {
		int[] n1= {1,2,3,4,5,6};
		boolean ans=checkNumber(n1,9);
		System.out.println(ans);
	}

}
