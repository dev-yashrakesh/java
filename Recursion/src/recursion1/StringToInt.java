package recursion1;

public class StringToInt {

	public static int convertStringToInt(String input){
		if(input.length()<1)
		{
			return 0;
		}
		int ans=input.charAt(input.length()-1)-'0';
		int smallAns=10*convertStringToInt(input.substring(0,input.length()-1));
		return ans+smallAns;
	}
	
	
	
	public static void main(String[] args) {
		String s="234";
		System.out.println(convertStringToInt(s));

	}

}
