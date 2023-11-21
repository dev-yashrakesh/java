package recursion1;

public class RemoveDuplicate {

	public static String removeConsecutiveDuplicates(String s) {
		if(s.length()-1==0) {
			return s;
		}
		
		String ans="";
		if(s.charAt(0)!=s.charAt(1)) {
			ans=ans+s.charAt(0);
		}
		
		String smallAns=removeConsecutiveDuplicates(s.substring(1));
		return ans+smallAns;
		
	}

	
	
	public static void main(String[] args) {
		String s="aaabbbcccddd";
		System.out.println(removeConsecutiveDuplicates(s));

	}

}
