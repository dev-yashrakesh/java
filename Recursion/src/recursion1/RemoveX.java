package recursion1;

public class RemoveX {

	public static String removeX(String input){
		if(input.length()==0) {
			return input;
		}
		
		String ans="";
		if(input.charAt(0)!='x') {
			ans=ans+input.charAt(0);
		}
		
		String smallAns=removeX(input.substring(1));
		return ans+smallAns;

	}
	
	public static void main(String[] args) {
		String ans="xxxa";
		System.out.println(removeX(ans));
	}

}
