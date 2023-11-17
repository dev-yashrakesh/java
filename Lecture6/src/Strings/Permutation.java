package Strings;

public class Permutation {

	public static boolean isPermutation(String str1, String str2) {
		int n=str1.length();
		int m=str2.length();
		int count=0;
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				if(n!=m) {
					return false;
				}
				
				if(str1.charAt(i)==str2.charAt(j)) {
					count++;
				}
			}
		}if(count==n) {
		
		return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String str1="elloh";
		String str2="hello";
		boolean i=isPermutation(str1,str2);
		System.out.print(i);

	}

}
