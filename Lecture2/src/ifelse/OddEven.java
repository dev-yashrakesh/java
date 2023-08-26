package ifelse;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		if (i%2==0) {
			System.out.println(i+" is even");
		}
		
		else {
			System.out.println(i+" is odd");
		}
		

	}

}
