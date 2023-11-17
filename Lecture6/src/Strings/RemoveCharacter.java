package Strings;

public class RemoveCharacter {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String ans="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch);
			else {
				ans+=str.charAt(i);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String str="Codingo";
		String i=removeAllOccurrencesOfChar(str,'o');
		System.out.print(i);

	}

}
