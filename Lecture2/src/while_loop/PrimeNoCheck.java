package while_loop;
import java.util.Scanner;

public class PrimeNoCheck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		int i=2;
		while(i<N-1) {
			if (N%i==0) {
				System.out.println(N+" is not a prime number");
				return;
			}
			i=i+1;
		}
		System.out.println(N+" is a prime number");

	}

}
