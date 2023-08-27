package pattern;
import java.util.Scanner;
public class SqaurePattern28 {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("*");
		int i =1;
		while (i<=n) {
			System.out.print("*");
			int j  = 1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			j = j-2;
			while(j>=1) {	
				System.out.print(j);	
				j--;	
			}
			
			System.out.print("*");
			System.out.println();
			i++;
		}
		i = 1;
		while (i<=n-1) {
			System.out.print("*");
			int j = 1;
			while(j<=n-i) {
				System.out.print(j);
				j++;
			}
			j = j-2;
			while(j>=1) {
				System.out.print(j);
				j--;
			}
			
			System.out.print("*");
			System.out.println();
			i++;
		}
		System.out.print("*");	
        
    }
}
