package LinkedList;

public class AppendToN {

	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		if(head==null||head.next==null){
			return head;
		}
		if(n==0){
			return head;
		}
	int count=0;
	Node<Integer> temp=head;
	while(temp!=null) {
		temp=temp.next;
		count++;
	}
	int newcount=count-n;
	count=0;
	Node<Integer> temp1=head;
	while(count<newcount-1) {
		temp1=temp1.next;
		count++;
	}
	Node<Integer> temp2=temp1.next;
	Node<Integer> temp3=temp1.next;
	while(temp2.next!=null) {
		temp2=temp2.next;
	}
	temp2.next=head;
	temp1.next=null;
	return temp3;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
