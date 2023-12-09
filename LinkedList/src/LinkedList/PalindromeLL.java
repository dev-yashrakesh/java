package LinkedList;

public class PalindromeLL {

	
	 public static boolean isPalindrome(Node<Integer> head) {
	        if (head == null || head.next == null) {
	            return true;
	        }
	        Node<Integer> temp = head, mid, h2;
	        mid = midPoint(temp);
	        h2 = mid.next;
	        mid.next = null;
	        h2 = reverse_I(h2);
	        boolean flag = true; 
	        while (temp != null && h2 != null) {
	            if (!temp.data.equals(h2.data)) {
	                flag = false;
	                break; 
	            }
	            temp = temp.next;
	            h2 = h2.next;
	        }

	        return flag;
	    }
	
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
public static Node<Integer> reverse_I(Node<Integer> head){
        
        Node<Integer> curr=head;
        Node<Integer> prev=null;
        Node<Integer> temp;
        
        while(curr!=null) {
        	temp=curr.next;
        	curr.next=prev;
        	prev=curr;
        	curr=temp;
        }
        return prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
