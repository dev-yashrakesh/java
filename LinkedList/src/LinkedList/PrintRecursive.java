package LinkedList;

public class PrintRecursive {

	public static void printR(Node<Integer> head) {
		if(head==null) {
			return;
		}
		System.out.print(head.data+" ");
		printR(head.next);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
