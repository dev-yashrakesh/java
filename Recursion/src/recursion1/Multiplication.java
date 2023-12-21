package recursion1;

public class Multiplication {

	public static int multiplyTwoIntegers(int m, int n){
		if(m<n) {
			return multiplyTwoIntegers(n,m);
		}
		else if(n!=0) {
			return m+multiplyTwoIntegers(m,n-1);
		}
		return 0;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
