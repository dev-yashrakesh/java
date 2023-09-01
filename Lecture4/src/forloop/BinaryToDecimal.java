package forloop;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int store=0;
		while(n>0) {
			int lastdigit=n%10;
			n=n/10;
			store=store+(lastdigit*i);
			i=i+i;
		}
		System.out.println(store);
	}

}
