package recursion1;

public class SumOfArray {

	public static int sumHelper(int input[],int currentIndex) {
		if(currentIndex<0) {
			return 0;
		}
		
		int currentvalue=input[currentIndex];
		int remainingvalue=sumHelper(input,currentIndex-1);
		
		return currentvalue+remainingvalue;
		
	}
	
	public static int sum(int input[]) {
		return sumHelper(input,input.length-1);
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		System.out.println(sum(arr));

	}

}
