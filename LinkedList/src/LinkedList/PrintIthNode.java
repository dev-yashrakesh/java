package LinkedList;

public class PrintIthNode {

	 public static void printIthNode(Node<Integer> head, int i){
	     int index=0;
	     while(head!=null) {
	    	 if(i==index) {
	    		 System.out.println(head.data);
	    		 return;
	    	 }
	    	 else {
	    		 head=head.next;
	    		 index++;
	    	 }
	     }
		 
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
