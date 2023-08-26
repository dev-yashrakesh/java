package while_loop;
import java.util.Scanner;

public class print1toN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		int i=1;
		while (i<=N) {
			System.out.println(i);
			i=i+1;
		}
		

	}

}
