package Stack;

import java.util.Stack;

public class ValidParenthesis {

	 public static boolean isBalanced(String expression) {
	        Stack<Character> ans=new Stack<>();
	        for(int i=0;i<expression.length();i++) {
	        	if(expression.charAt(i)=='('||expression.charAt(i)=='['||expression.charAt(i)=='{') {
	        		ans.push(expression.charAt(i));
	        	}
	        	else if(expression.isEmpty()) {
	        		return false;
	        	}
	        	else if(ans.peek()=='('&&expression.charAt(i)==')') {
	        		ans.pop();
	        	}
	        	else if(ans.peek()=='{'&&expression.charAt(i)=='}') {
	        		ans.pop();
	        	}
	        	else if(ans.peek()=='['&&expression.charAt(i)==']') {
	        		ans.pop();
	        	}
	        	else {
	        		return false;
	        	}
	        }
	        return ans.isEmpty();
	    }
	
	public static void main(String[] args) {
		

	}

}
