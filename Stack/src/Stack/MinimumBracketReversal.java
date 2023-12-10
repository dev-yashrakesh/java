package Stack;

import java.util.Stack;

public class MinimumBracketReversal {

	public static int countBracketReversals(String input) {
		if(!(input.length()%2==0)) {
			return -1;
		}
		
		Stack<Character> s=new Stack<>();
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch=='}'&&!s.isEmpty()) {
				if(s.peek()=='{') {
					s.pop();
				}
				else {
					s.push(ch);
				}
			}
			else {
				s.push(ch);
			}
		}
		int m=s.size();
		int n=0;
		while(!s.isEmpty()&&s.peek()=='{') {
			s.pop();
			n++;
		}
		return((m/2)+(n%2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
