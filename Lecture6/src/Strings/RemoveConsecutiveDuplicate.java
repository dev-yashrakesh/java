package Strings;

public class RemoveConsecutiveDuplicate {

	public static String removeConsecutiveDuplicates(String str) {
		int n=str.length();
		String result="";
		char ch=str.charAt(0);
		result+=ch;
		for(int i=1;i<n;i++) {
			if(str.charAt(i)==ch);
			
			else {
				result+=str.charAt(i);
				ch=str.charAt(i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str1="aabc";
		String i=removeConsecutiveDuplicates(str1);
		System.out.print(i);

	}

}
