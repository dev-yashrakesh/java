package Strings;

public class AllSubString {

	public static void substring(String str) {
		for(int start=0;start<str.length();start++) {
			for(int end=start;end<=str.length();end++) {
				System.out.println(str.substring(start, end));
			}
		}
	}
	
	public static void main(String[] args) {
		String str="abc";
		substring(str);
		
		

	}

}
