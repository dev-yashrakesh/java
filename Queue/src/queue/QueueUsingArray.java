package queue;

public class QueueUsingArray {

	private int data[];
	private int front;
	private int rear;
	private int size;
	
	
	public QueueUsingArray() {
		data=new int[10];
		front=-1;
		rear=-1;
		size=0;
	}
	
	public QueueUsingArray(int capacity) {
		data=new int[capacity];
		front=-1;
		rear=-1;
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	public int front() throws QueueEmptyEception {
		if(size()==0) {
			QueueEmptyEception e=new QueueEmptyEception();
			throw e;
		}
		return data[front];
	}
	
	void enqueue(int element) throws QueueFullException {
		if(size()==data.length) {
			DataCapacity();
		}
		if(size()==0) {
			front=0;
		}
		if(rear==data.length) {
			rear=0;
		}
		size++;
		rear++;
		data[rear]=element;
		
	}
	
	private void DataCapacity() {
		int temp[]=data;
		data=new int[2*temp.length];
		int index=0;
		for(int i=front;i<temp.length;i++) {
			data[index]=temp[i];
			index++;
		}
		for(int i=0;i<=front;i++) {
			data[index]=temp[i];
			index++;
		}
		
	}

	int dequeue() throws QueueEmptyEception {
		if(size()==0) {
			throw new QueueEmptyEception();
		}
		
		int temp=data[front];
		front++;
		if(front==data.length) {
			front=0;
		}
		size--;
		if(size()==0) {
			front =-1;
			rear=-1;
		}
		return temp;
	}
}
