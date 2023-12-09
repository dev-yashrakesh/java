package LinkedList;

public class BubbleSort {

	public static Node<Integer> bubbleSort(Node<Integer> head )
	{    if(head==null || head.next==null) {
        return head;
	} 
        for(int i=0;i<lengthLL(head)-1;i++){
            Node<Integer> prev = null;
            Node<Integer> curr = head;
            Node<Integer> next = curr.next;

            while(curr.next != null){
                if(curr.data > curr.next.data){
                    if(prev == null){
                        curr.next = next.next;
                        next.next = curr;
                        prev = next;
                        head = prev;
                    }else{
                        next = curr.next;
                        curr.next = next.next;
                        prev.next = next;
                        next.next = curr;
                        prev = next;
                    }
                }else{
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
        return head;
    }
    
    private static int lengthLL(Node<Integer> head){
        int count = 1;
        while(head.next != null){
            head = head.next;
            count++;
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
