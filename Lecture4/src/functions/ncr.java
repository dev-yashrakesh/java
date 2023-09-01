package functions;

import java.util.Scanner;

public class ncr {
	public static int factorial (int n) {
		int ans=1;
		for(int i=1;i<=n;i++) {
			ans=ans*i;
		}
		return ans;
	}

	
	public static int ncr1(int n,int r) {
		
		int num=factorial(n);
		int deno1=factorial(r);
		int deno2=factorial(n-r);
		
		int ncr=num/(deno1*deno2);
		return ncr;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=s.nextInt();
		int ans=ncr1(n,r);
		System.out.println(ans);
	}

}
