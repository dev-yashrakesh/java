package forloop;
import java.util.Scanner;
public class BreakStat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while (i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(j+" ");
				j++;
				if(j>i) {
					break;
				}
			}
			System.out.println();
			i++;
		}

	}

}
