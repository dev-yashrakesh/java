package pattern;
import java.util.Scanner;
public class SqaurePattern16 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			char ch=(char)('A'+n-1);
			while(j<=i) {
				System.out.print((char)(ch));
				ch=(char)(ch-1);
				j++;
			}
			i++;
			System.out.println();
		}
		
	}

}
