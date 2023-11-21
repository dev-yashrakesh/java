package recursion1;

public class Palindrome {

	public static boolean isPalindrome(String str) {
		return isPalindrome(str,0,str.length()-1);
	}
	
	public static boolean isPalindrome(String str,int start,int end) {
		
		if(start>=end) {
			return true;
		}
		if(str.charAt(start)!=str.charAt(end)) {
			return false;
		}
		return true;
    }
	
	public static void main(String[] args) {
		String s="abbac";
		System.out.println(isPalindrome(s));

	}

}
