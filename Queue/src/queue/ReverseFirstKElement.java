package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElement {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		Stack<Integer> s=new Stack<>();
		Queue<Integer> ans=new LinkedList<>();
		while(k>0) {
			s.push(input.peek());
			input.remove();
			k--;
		}
		while(!s.isEmpty()) {
			ans.add(s.peek());
			s.pop();
		}
		while(!input.isEmpty()) {
			ans.add(input.peek());
			input.remove();
		}
		return ans;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
