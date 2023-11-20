package recursion1;

public class PrintNumber {

	public static void print(int n){
	if(n>0) {
		print(n-1);
		System.out.print(n+" ");
	}	
	

}
	
	public static void main(String[] args) {
		int n=10;
		print(n);

	}

}
