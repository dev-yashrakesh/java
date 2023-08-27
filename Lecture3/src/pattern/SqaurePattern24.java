package pattern;
import java.util.Scanner;
public class SqaurePattern24 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=n;
			int start=(2*i)-1;
			while(j>0) {
				System.out.print(start);
				start=start+2;
				
				int maxValue=(2*n)-1;
				if (start>maxValue) {
					start=1;
				}
				j--;
			}
			
			System.out.println();
			i++;
		}
		
	}

}
