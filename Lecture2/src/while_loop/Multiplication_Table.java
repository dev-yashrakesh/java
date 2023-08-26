package while_loop;
import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		int i=1;
		int mul;
		
		while(i<=10) {
			mul=i*N;
			System.out.println(mul);
			i=i+1;
		}

	}

}
