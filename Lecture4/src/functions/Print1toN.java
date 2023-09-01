package functions;

import java.util.Scanner;

public class Print1toN {

	public static void PrinttoN(int n) {
		if (n<=0) {
			return;
		}
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		PrinttoN(n);

	}

}
