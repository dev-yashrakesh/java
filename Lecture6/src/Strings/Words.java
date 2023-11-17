package Strings;

public class Words {

	public static int countWords(String str) {	
		int len=str.length();
		int count=1;
		for(int i=0;i<len;i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str="Coding Ninja";
		int i=countWords(str);
		System.out.println(i);

	}

}
