package forloop;
import java.util.Scanner;
public class FibonacciNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		int f1=1,f2=1,nextTerm=0;
		
		if (n==1 ) {
			nextTerm=1;
		}
		else {
		int i=3;
		while (i<=n) {
			nextTerm=f1+f2;
			f1=f2;
			f2=nextTerm;
			i++;
		}
		
		}System.out.println(nextTerm);

}
}