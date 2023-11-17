package Strings;

public class PalindromeString {

	public static boolean Palindrome(String str) {
//		String reverse="";
//		for(int i=str.length()-1;i>0;i--) {
//			reverse+=str.charAt(i);
//		}
		int k=str.length()-1;
		int j=0;
		while(j<k) {
			if(str.charAt(j)!=str.charAt(k)) {
				
				return false;
			}
			else {
				j++;
				k--;
			}
		}return true;
		
	}
	
	public static void main(String[] args) {
		String str="nitin";
		Boolean i=Palindrome(str);
		System.out.println(i);

		
		
		
	}

}
