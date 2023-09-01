package functions;

public class FahrenheiteToCelsius {

	public static void printFahrenheitTable(int start,int end,int step) {
		while(start<=end) {
			int cel=((start-32)*5)/9;
			System.out.println(start+" "+cel);
			start=start+step;
			
		}
	}
}
