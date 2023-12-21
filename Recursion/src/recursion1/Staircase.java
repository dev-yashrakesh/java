package recursion1;

public class Staircase {

	 public static int staircase(int n){
			
			if(n==0) {
				return 1;
			}
			if(n<0) {
				return 0;
			}
			
			int recCall1=staircase(n-1);
			int recCall2=staircase(n-2);
			int recCall3=staircase(n-3);
			int smallans=recCall1+recCall2+recCall3;
			return smallans;
			}
	
	public static void main(String[] args) {
		int n=4;
		int ans=staircase(n);
		System.out.println(ans);

	}

}
