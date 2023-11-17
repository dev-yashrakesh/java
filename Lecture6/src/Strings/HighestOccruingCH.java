package Strings;
import java.util.Scanner;
public class HighestOccruingCH {

	public static char highestOccuringChar(String str) {
		int c1 = 0,c2 = 0,i,j;
		char maxChar = '\0';
		j = 0;
		while(j < str.length()) {
		i = 0;
		do {
			if(str.charAt(i) == str.charAt(j)) {
				c2++;
			}
			i++;
		}while(i < str.length());
		if(c2 > c1) {
			maxChar = str.charAt(j) ;
			c1 = c2;
		}
		c2 = 0;
		j++;
	}
		return maxChar;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inputString = s.nextLine();
		char result = highestOccuringChar(inputString);
System.out.print(result);
	}

}
