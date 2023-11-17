package classes_and_object;

public class DynamicArray {
	private int data[];
	private int nextIndex;
	
	public DynamicArray() {
		data=new int[5];
		nextIndex=0;
	}
	
	public int size() {
		return nextIndex;
	}
	
	public void add(int element) {
		if(nextIndex==data.length) {
			reconstruct();
		}
		else {
			data[nextIndex]=element;
			nextIndex++;
		}
	}
	
	public void set(int index,int element) {
		if(nextIndex<index) {
			return;
		}
		
		else if(nextIndex>index) {
			data[index]=element;
		}
		else {
			add(element);
		}
	}
	
	public int get(int index) {
		if(nextIndex<=index) {
			return -1;
		}
		else {
			return data[index];
		}
	}
	
	public boolean isEmpty() {
		if(size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int removeLast() {
		int value=data[nextIndex-1];
		data[nextIndex-1]=0;
		nextIndex--;
		return value;
	}
	
	public void reconstruct() {
		int temp[]=data;
		data= new int[data.length*2];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}
}
