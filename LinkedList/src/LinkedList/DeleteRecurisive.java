package LinkedList;

public class DeleteRecurisive {

	public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
		if(pos==0) {
			return head.next;
		}
		if(head==null) {
			return head;
		}
		if(head.next==null) {
			return head;
		}
		head.next=deleteNodeRec(head.next,pos-1);
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
