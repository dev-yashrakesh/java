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
	 public static Node<Integer> midPoint(Node<Integer> head) {
	        Node<Integer> slow=head,fast=head;
	        while(fast.next!=null && fast.next.next!=null) {
	        	slow=slow.next;
	        	fast=fast.next.next;
	        }
	        return slow;
	    }
	 
	 public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
	        if(head1==null) {
	        	return head2;
	        }
	        if(head2==null) {
	        	return head1;
	        }
	        
	        Node<Integer> t1=head1,t2=head2;
	        Node<Integer> head=null , tail=null;
	        
	        if(t1.data<=t2.data) {
	        	head=t1;
	        	tail=t1;
	        	t1=t1.next;
	        }
	        else {
	        	head=t2;
	        	tail=t2;
	        	t2=t2.next;
	        }
	        
	        while(t1!=null && t2!=null) {
	        	if(t1.data<=t2.data) {
	        		tail.next=t1;
	        		tail=t1;
	        		t1=t1.next;
	        	}
	        	else {
	        		tail.next=t2;
	        		tail=t2;
	        		t2=t2.next;
	        	}
	        }
	        if(t1!=null) {
	        	tail.next=t1;
	        }
	        if(t2!=null) {
	        	tail.next=t2;
	        }
	        return head;
	    }
	 
	 public static Node<Integer> mergeSort(Node<Integer> head) {
			if(head==null) {
				return head;
			}
			if(head.next==null) {
				return head;
			}
			Node<Integer> mid=midPoint(head);
			Node<Integer> h2=mid.next;
			mid.next=null;
			Node<Integer> part1=mergeSort(head);
			Node<Integer> part2=mergeSort(h2);
			Node<Integer> merge=mergeTwoSorteds(part1,part2);
			return merge;
			
		}
	
	public static void main(String[] args) {
		Node<Integer> head=takeinput();
////		head=insert(head, 80, 0);
//		head=deleteNode(head,0);
//		print(head);
		
		Node<Integer> mid=midPoint(head);
		System.out.println(mid.data);
	

	}

}
