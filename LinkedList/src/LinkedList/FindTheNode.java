package LinkedList;

public class FindTheNode {

	public static int findNode(Node<Integer> head, int n) {
		int index=0;
		while(head!=null) {
			if(head.data==n) {
				return index;
			}
			else {
				index++;
				head=head.next;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
