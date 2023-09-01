package functions;

import java.util.Scanner;

public class checkingFibo {

	public static boolean checkMember(int n) {
		int a=0;
		int b=1;
		int temp;
		for(int i=1;i<=n;i++) {
			temp=a+b;
			a=b;
			b=temp;
			if (temp==n) {
				return true;
			}
		}return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean ans=checkMember(n);
		System.out.println(ans);

	}
}
