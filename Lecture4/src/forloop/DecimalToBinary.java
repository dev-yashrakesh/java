package forloop;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextInt();
		long i=1;
		long binary=0;
		while(n>0) {
			long rev=n%2;
			binary=(rev*i)+binary;
			n=n/2;
			i*=10;
			
		}System.out.print(binary);
		
	}

}
