package LinkedList;

public class InsertRecursive {

	public static Node<Integer> insert(Node<Integer> head,int pos,int element){
		Node<Integer> newNode=new Node<>(element);
		if(pos==0) {
			newNode.next=head;
			return head;
		}
		if(head==null) {
			return head;
		}
		head.next=insert(head.next,pos-1,element);
		return head;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
