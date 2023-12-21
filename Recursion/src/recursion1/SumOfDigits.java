package recursion1;

public class SumOfDigits {

	public static int sumOfDigits(int input){
		int sum=0;
		while(input>0) {
			int n=input%10;
			input=input/10;
			sum=sum+n;
		}
		return sum;

	}
	
	public static void main(String[] args) {
		int n=12345;
		System.out.println(sumOfDigits(n));

	}

}
