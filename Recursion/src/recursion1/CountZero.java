package recursion1;

public class CountZero {

	public static int countZerosRec(int input){
		if(input==0) {
			return 1;
		}
		if(input<9) {
			return 0;
		}
		if(input%10==0) {
			return 1+countZerosRec(input/10);
		}
		return countZerosRec(input/10);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
