package recursion1;
import java.util.Scanner;
public class Fibonacci {
	
	public static int fib(int n) {
		if(n==0||n==1) {
			return n;
		}

		int ans=fib(n-1)+fib(n-2);
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans=fib(n);
		System.out.println(ans);

	}

}
