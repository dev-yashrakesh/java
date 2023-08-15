package practice;
import java.util.Scanner;
public class CelciusConv {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int fahrenheit=scan.nextInt();
		
//		int celcius=(5/9)*(fahrenheit-32);
		int celcius=(int)((5.0/9)*(fahrenheit-32));
		System.out.println(celcius);
		
		System.out.println(5+6);
		System.out.println(6-3);
		System.out.println(8/4);
		System.out.println('a'+4);
		
		char c='v';
		char v=(char)(c+4);
		System.out.println(v);
	}

}
