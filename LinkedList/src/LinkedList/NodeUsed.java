package LinkedList;

import java.util.Scanner;

public class NodeUsed {

	public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		int index=0;
		Node<Integer> temp=head;
		if(head==null) {
			return head;
		}
		if(pos==0) {
			head=temp.next;
		}
		while(temp!=null&&index<pos-1) {
			
			temp=temp.next;
			index++;
		}
		
		if(temp==null) {
			return head;
		}
		if(temp.next!=null) {
		temp.next=temp.next.next;
		
		}
		return head;
	}
	
	public static Node<Integer> takeinput(){
		Node<Integer> head=null, tail=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		
		while(data!=-1) {
			Node<Integer> newNode=new Node<Integer>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
//				Node<Integer> temp=head;
//				while(temp.next!=null) {
//					temp=temp.next;
//				}
//				temp.next=newNode;
				
				tail.next=newNode;
				tail=newNode;
			}
			data=s.nextInt();
		}
		return head;
	}
	
	public static Node<Integer> insert(Node<Integer> head,int data,int pos) {
		Node<Integer> newNode=new Node<>(data);
		int index=0;
		if(pos==0) {
			newNode.next=head;
			return newNode;
		}
		Node<Integer> temp=head;
		while(index<pos-1) {
			temp=temp.next;
			index++;
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
	}
	
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	
	public static int length(Node head){
       int index=0;
       while(head!=null) {
    	   head=head.next;
    	   index++;
       }
       return index;
    }
	
	public static void main(String[] args) {
		Node<Integer> head=takeinput();
//		head=insert(head, 80, 0);
		head=deleteNode(head,0);
		print(head);
	

	}

}
