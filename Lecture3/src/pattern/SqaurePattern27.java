package pattern;
import java.util.Scanner;
public class SqaurePattern27 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int sum = 0;
		while (i<=n) {
			int j = 1;
			sum = sum + i;
			while (j<=i) {
				System.out.print(j);
				if (j == i) {
					System.out.print("=");
				}
				else {
					System.out.print("+");
				}
				j++;
			}
			System.out.print(sum);
			i++;
			System.out.println();
		}

	}
}
