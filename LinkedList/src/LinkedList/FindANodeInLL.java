package LinkedList;

public class FindANodeInLL {

	public static int findNodeRec(Node<Integer> head, int n) {
    	if(head==null) {
    		return -1;
    	}
    	int index=0;
    	while(head!=null) {
    		if(head.data==n) {
    			return index;
    		}
    		else {
    			head=head.next;
    			index++;
    		}
    	}
    	return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
