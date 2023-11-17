package Strings;

public class ReverseString {

	public static String reverse(String str) {
		String temp="";
		int n=str.length();
		for(int i=n-1;i>0;i--) {
			temp+=str.charAt(i);
		}
		return temp;
	}
	
	public static void main(String[] args) {
		String str="Coding Ninja";
		String i=reverse(str);
		System.out.println(i);

	}

}
