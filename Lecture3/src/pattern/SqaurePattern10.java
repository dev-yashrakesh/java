package pattern;

import java.util.Scanner;

public class SqaurePattern10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int start=i;
			while(j<=i) {
				System.out.print(start);
				start--;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
