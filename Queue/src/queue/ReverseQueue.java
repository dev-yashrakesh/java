package queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

	public static void reverseQueue(Queue<Integer> input) {
		Stack<Integer> s=new Stack<>();
		while(!input.isEmpty()) {
			s.push(input.peek());
			input.remove();
		}
		
		while(!s.isEmpty()) {
			input.add(s.peek());
			s.pop();
		}
		
	}
	
	public static void main(String[] args) {
		

	}

}
