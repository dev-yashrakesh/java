package LinkedList;

import java.util.Scanner;

public class ReverseLL {

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

public static void print(Node<Integer> head) {
	while(head!=null) {
		System.out.print(head.data+" ");
		head=head.next;
	}
}

public static Node<Integer> takeinput(){
	Node<Integer> head=null,tail=null;
	Scanner s=new Scanner(System.in);
	int data=s.nextInt();
	while(data!=-1) {
		Node<Integer> newNode=new Node<>(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
		data=s.nextInt();
	}
	return head;
}
	
	public static void main(String[] args) {
		Node<Integer> head=takeinput();
		head=reverse_I(head);
		print(head);

	}

}
