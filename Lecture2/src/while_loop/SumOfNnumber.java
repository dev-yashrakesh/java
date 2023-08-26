package while_loop;
import java.util.Scanner;

public class SumOfNnumber {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int N=s.nextInt();
		
		int i=1;
		int sum=0;
		while (i<=N) {
//			i=i+1;
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);

	}

}
