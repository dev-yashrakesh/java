package pattern;

import java.util.Scanner;

public class SqaurePattern15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=n;
		while(i>=1) {
			int j=i;
			char ch=(char)('A'+j-1);
			while(j<=n) {
				System.out.print((char)(ch));
				ch=(char)(ch+1);
				j++;
				
			}
			System.out.println();
			i--;
			
			
			
			
		}
	}

}
