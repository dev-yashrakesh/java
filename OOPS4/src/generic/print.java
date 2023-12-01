package generic;

public class print {

	public static<T> void println(T a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer arr[]=new Integer[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		
		String ar[]=new String[10];
		for(int i=0;i<ar.length;i++) {
			ar[i]="abc";
		}
		println(arr);
		println(ar);

	}

}
