package recursion1;

public class SubsequenceOfString {

	public static String[] findSubsequence(String s) {
		if(s.length()==0) {
			String ans[]= {""};
			return ans;
		}
		String smallAns[]=findSubsequence(s.substring(1));
		String  ans[]=new String[2*smallAns.length];
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			ans[k]=smallAns[i];
			k++;
		}
		
		for(int i=0;i<smallAns.length;i++) {
			ans[k]=s.charAt(0)+smallAns[i];
			k++;
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		String ans= "xyz12342";
		String ans1[]=findSubsequence(ans);
		for(int i=0;i<ans1.length;i++) {
			System.out.println(ans1[i]);
		}

	}

}
