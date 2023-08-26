package ifelse;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int pow=1;
		int i=1;
		while(i<=b) {
			 pow=pow*a;
			 i=i+1;
			
		}
		System.out.println(pow);

	}

}
