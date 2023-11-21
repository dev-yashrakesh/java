package recursion1;

import java.util.Scanner;

public class SumToNaturalNumbers {

	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return sum(n-1)+n;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans=sum(n);
		System.out.println(ans);

	}

}
