package while_loop;
import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int digit;
		int even=0,odd=0;
		while(N>0) {
			digit=N%10;
			N=N/10;
			
			if (digit%2!=0) {
				odd=odd+digit;
			}
			else {
				even=even+digit;
			}
			
		}
		System.out.print(even+" "+odd);
		

	}

}
