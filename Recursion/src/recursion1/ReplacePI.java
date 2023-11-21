package recursion1;

public class ReplacePI {

	public static String replace(String input){
		if(input.length()<=0) {
			return input;
		}
		if(input.charAt(0)=='p'&&input.charAt(1)=='i') {
			String smallAns=replace(input.substring(2));
			return "3.14"+smallAns;
		}
		else {
			String smallAns=replace(input.substring(1));
			return input.charAt(0)+smallAns;
		}

	}
	
	public static void main(String[] args) {
		String s="xpixxpixx";
		System.out.println(replace(s));

	}

}
