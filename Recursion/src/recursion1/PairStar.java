package recursion1;

public class PairStar {

	public static String addStars(String s) {

		if(s.length()<=1) {
			return s;
		}
		String ans="";
		if(s.charAt(0)==s.charAt(1)) {
			ans=ans+s.charAt(0)+"*";
		}
		else {
			ans=ans+s.charAt(0);
		}
		String smallAns=addStars(s.substring(1));
		return ans+smallAns;
		
	}
	
	public static void main(String[] args) {
		String s="aaaa";
		System.out.println(addStars(s));

	}

}
