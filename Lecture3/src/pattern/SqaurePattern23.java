package pattern;
import java.util.Scanner;
public class SqaurePattern23 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int start=1;
			while(start<=n-i) {
				System.out.print(" ");
				start++;
			}
			int j=1;
			int p=i;
			while(j<=i) {
				System.out.print(p);
				p++;
				j++;
			}
			
			j=1;
			p=(i-1)*2;
			
			while(j<=i-1) {
				System.out.print(p);
				p--;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
