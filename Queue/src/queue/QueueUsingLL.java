package queue;

public class QueueUsingLL<T> {

	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public QueueUsingLL() {
		front=null;
		rear=null;
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	public T front() throws QueueEmptyEception {
		if(size==0) {
			QueueEmptyEception e=new QueueEmptyEception();
			throw e;
		}
		return front.data;
	}
	
	public void enqueue(T element) {
		Node<T> newNode=new Node<>(element);
		if(rear==null) {
			rear=newNode;
			front=newNode;
		}
		else {
			rear.next=newNode;
			rear=newNode;
		}
		size++;
	}
	
	public T dequeue() throws QueueEmptyEception {
		if(size==0) {
			throw new QueueEmptyEception();
		}
		T temp=front.data;
		front=front.next;
		if(size==1) {
			rear=null;
		}
		size--;
		return temp;
		
	}
	
}
