package functions;

import java.util.Scanner;

public class primeNo {
	
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		boolean ans=isPrime(n);
		System.out.println(ans);
	}

}
