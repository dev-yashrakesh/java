package forloop;
import java.util.Scanner;
public class AP {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int j=1;
		while(j<=n) {
			int a_p=(3*i)+2;
			
			if (!(a_p%4==0)) {
				System.out.print(a_p+" ");
			}
			else {
				j--;
			}
			i++;
			j++;
		}

	}

}
