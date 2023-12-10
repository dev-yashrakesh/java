package Stack;

public class StackUsing {

	public static void main(String[] args) throws StackFullException {
		StackUsingArray s=new StackUsingArray(3);
		for(int i=1;i<=5;i++) {
			s.push(i);
		}
		
		while(!s.isEmpty()) {
			try {
				System.out.println(s.pop());
			} catch (StackEmptyException e) {
				
			}
		}

	}

}
