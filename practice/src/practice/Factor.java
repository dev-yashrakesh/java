package practice;
import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		boolean a=false;
		int i=2;
	while(i<=N-1) {
		if (N%i==0) {
			System.out.print(i+" ");
			a=true;
		}
		i=i+1;
			
		}
	if(a==false) {
		System.out.println(-1);
	}
	
	
	}
}