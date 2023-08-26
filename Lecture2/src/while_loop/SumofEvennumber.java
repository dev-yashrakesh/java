package while_loop;

import java.util.Scanner;

public class SumofEvennumber {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int N=s.nextInt();
		
		int i=0;
		int sum=0;
		while (i<=N) {
			sum=sum+i;
			i=i+2;
		}
		System.out.println(sum);
		


	}

}
