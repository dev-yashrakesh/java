package LinkedList;

public class MidPoint {

	 public static Node<Integer> midPoint(Node<Integer> head) {
	        Node<Integer> slow=head,fast=head;
	        if(head==null) {
	        	return head;
	        }
	        while(fast.next!=null && fast.next.next!=null) {
	        	slow=slow.next;
	        	fast=fast.next.next;
	        }
	        return slow;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
