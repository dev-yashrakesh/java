package practice;
import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int j=s.nextInt();
		
		boolean isEq=(i==j);
		boolean neg=(i!=j);
		boolean greEq=(i>=j);
		boolean lessEq=(i<=j);
		boolean gre=(i>j);
		boolean less=(j<i);
		
		System.out.println("Is equal "+isEq);
		System.out.println("Is Neg "+neg);
		System.out.println("Is greEq "+greEq);
		System.out.println("Is lessEq "+lessEq);
		System.out.println("Is Greater "+gre);
		System.out.println("Is less "+less);

	}

}
