package forloop;
import java.util.Scanner;
public class AllPrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=2;
		while(i<=n) {
			int count=0;
			int j=2;
			while(j<=i) {
				if (i%j==0) {
					count++;
				}
				j++;
			}
			if (count==1) {
			System.out.println(i);
			
		}
			i++;

	}

}
}
