package forloop;
import java.util.Scanner;
public class SumOrProd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=s.nextInt();
		int sum=0,prod=1;
		
		if(c==1) {
			int i=1;
			while(i<=n) {
				sum+=i;
				i++;
			}System.out.println(sum);
		}
		else if (c==2) {
			int i=1;
			while(i<=n) {
				prod*=i;
				i++;
			}System.out.println(prod);
		}
		else {
			System.out.println("-1");
		}
	}

}
