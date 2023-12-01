package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println(list.size());
		list.add(10);
		list.add(15);
		list.add(30);
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		for(int elem : list) {
			System.out.print(elem+" ");
		}
	}

}

