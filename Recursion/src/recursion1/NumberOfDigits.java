package recursion1;

public class NumberOfDigits {

	
	 public static int countDigits(int n){
		 if (n==0) {
			 return 0;
		 }
		 return 1+countDigits(n/10);
	 }
	
	public static void main(String[] args) {
		int n=123;
		int ans=countDigits(n);
		System.out.println(ans);

	}

}
