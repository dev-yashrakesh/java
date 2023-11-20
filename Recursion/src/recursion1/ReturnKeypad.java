package recursion1;

public class ReturnKeypad {

	public static String[] keypad(int n){
		if(n==0||n==1) {
			String[] ans= {""};
			return ans;
		}
		int newn=n%10;
		String ans[]= keypad(n/10);
		String helps=helper(newn);
		String finalans[]=new String[ans.length*helps.length()];
		int k=0;
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<helps.length();j++) {
				finalans[k]=ans[i]+helps.charAt(j);
				k++;
			}
			return finalans;
		}
		

	}
	private static String helper(int newN){
        if(newN==2)
            return "abc";
        if(newN==3)
            return "def";
        if(newN==4)
            return "ghi";
        if(newN==5)
            return "jkl";
        if(newN==6)
            return "mno";
        if(newN==7)
            return "pqrs";
        if(newN==8)
            return "tuv";
        if(newN==9)
            return "wxyz";
        else
            return "";


    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
