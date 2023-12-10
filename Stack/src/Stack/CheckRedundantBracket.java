package Stack;

import java.util.Stack;

public class CheckRedundantBracket {

	public static boolean checkRedundantBrackets(String expression) {
		Stack<Character> ans=new Stack<>();
		for(int i=0;i<expression.length();i++) {
			char ch=expression.charAt(i);
			
			if(ch=='('||ch=='+'||ch=='*'||ch=='-'||ch=='/') {
				ans.push(ch);
			}
			else {
				if(ch==')') {
					boolean isRedundant=true;
					
					while(ans.peek()!='(') {
						char top=ans.peek();
						if(top=='+'||top=='*'||top=='-'||top=='/') {
							isRedundant=false;
						}
						ans.pop();
						
					}
					if(isRedundant==true) {
						return true;
					}
					ans.pop();
				}
			}
		}
		return false;
	}
		
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
