package forloop;
import java.util.Scanner;
public class SqaureRoot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int count;
		while(i*i<=n) {
			i++;
		}System.out.println(i-1);

	}

}
