package Stack;

public class StackUsingLL<T> {

	private Node<T>head;
	private int size;
	
	public StackUsingLL() {
		head=null;
		size=0;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public T top() throws StackEmptyException {
		if(size()==0) {
			StackEmptyException e=new StackEmptyException();
					throw e;
					
		}
		return head.data;
	}
	
	public void push(T elem) {
		Node<T> newNode=new Node<>(elem);
		newNode.next=head;
		head=newNode;
		size++;
	}
	
	public T pop() throws StackEmptyException {
		if(size()==0) {
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		T temp=head.data;
		head=head.next;
		size--;
		return temp;
	}
	
}
