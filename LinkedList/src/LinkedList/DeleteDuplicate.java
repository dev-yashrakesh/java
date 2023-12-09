package LinkedList;

public class DeleteDuplicate {

	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node<Integer> t1=head,t2=head.next,finalHead=head;
		while(t2!=null) {
			if(t1.data.equals(t2.data)) {
				t2=t2.next;
			}
			else {
				t1.next=t2;
				t1=t2;
			}
		}
		t1.next=null;
		return finalHead;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
