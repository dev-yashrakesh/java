package recursion1;

public class GeometricSum {

	public static double findGeometricSum(int k){
		if(k==0) {
			return 1;
		}
		return 1+0.5*findGeometricSum(k-1);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
