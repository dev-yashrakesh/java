package Strings;

public class ReverseEachWord {

	public static String reverseEachWord(String str) {
		String ans="";
		int currentWordStart=0;
		int i=0;
		for(;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				int CurrentWordEnd=i-1;
				String reverseWord="";
				for(int j=currentWordStart;j<=CurrentWordEnd;j++) {
					reverseWord=str.charAt(j)+reverseWord;
				}
				ans+=reverseWord+" ";
				currentWordStart=i+1;
			}
			
			
		}
		
		int CurrentWordEnd=i-1;
		String reverseWord="";
		for(int j=currentWordStart;j<=CurrentWordEnd;j++) {
			reverseWord=str.charAt(j)+reverseWord;
		}
		ans+=reverseWord;
		return ans;
	}
	
	public static void main(String[] args) {
		String str="Hello All";
		String i=reverseEachWord(str);
		System.out.print(i);

	}

}
