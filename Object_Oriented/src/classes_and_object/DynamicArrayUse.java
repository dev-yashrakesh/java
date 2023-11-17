package classes_and_object;

public class DynamicArrayUse {

	public static void main(String[] args) {
		DynamicArray d= new DynamicArray();
		
		for(int i=0;i<100;i++) {
			d.add(i+10);
		}

		System.out.println(d.size());
		
		d.set(4, 5);
		
		System.out.println(d.get(5));
		System.out.println(d.get(8));
		
		while(!d.isEmpty()) {
			System.out.println(d.removeLast());
			System.out.println("Size "+d.size());
		}
	}

}
