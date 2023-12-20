package queue;

import java.util.Stack;

public class QueueUsingStack {

	Stack<Integer> s1;
	Stack<Integer> s2;
	int size;
	
	public QueueUsingStack() {
		s1=new Stack<>();
		s2=new Stack<>();
		size=0;
	}
	
	void enqueue(int x) {
		while(!s1.isEmpty()) {
			s2.push(s1.peek());
			s1.pop();
		}
		
		s2.push(x);
		size++;
		while(!s2.isEmpty()) {
			s1.push(s2.peek());
			s2.pop();
		}
	}
	
	int dequeue() {
		int temp=s1.peek();
		s1.pop();
		size--;
		return temp;
	}
	
	int front() {
		return s1.peek();
	}
	
	boolean isEmpty() {
		return s1.isEmpty();
	}
	
	int getSize() {
		return size;
	}
	
}
