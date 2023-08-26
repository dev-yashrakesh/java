package while_loop;
import java.util.Scanner;
import java.lang.Math;
public class TotalSalary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int Basic_Sal=s.nextInt();
		String str=s.next();
		char grade=str.charAt(0);
		double hra=(0.2*Basic_Sal);
		double da=(0.5*Basic_Sal);
		double pf=(0.11*Basic_Sal);
		int allow;
		if (grade=='A') {
			allow=1700;
			
		}
		else if (grade=='B') {
			allow=1500;
			
		}
		else {
			allow=1300;
			
		}
		double total_Sal=Basic_Sal + hra + da + allow - pf;
		int p=(int)Math.round(total_Sal);
		System.out.println(p);

	}
}
