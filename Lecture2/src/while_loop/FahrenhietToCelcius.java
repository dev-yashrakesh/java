package while_loop;
import java.util.Scanner;

public class FahrenhietToCelcius {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int s=scan.nextInt();
		int e=scan.nextInt();
		int w=scan.nextInt();
		
		while(s<=e) {
			int c=(((s-32)*5)/9);
			System.out.println(s+" "+c);
			s=s+w;
		}

	}

}
