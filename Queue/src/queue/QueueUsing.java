package queue;

public class QueueUsing {

	public static void main(String[] args) throws QueueFullException, QueueEmptyEception {
		QueueUsingStack q=new QueueUsingStack();
		for(int i=1;i<=5;i++) {
			q.enqueue(i);
		}
		
//		while(!q.isEmpty()) {
//			System.out.print(q.dequeue()+" ");
//		}
		System.out.println(q.front());
		System.out.println(q.getSize());
	}
	
}
