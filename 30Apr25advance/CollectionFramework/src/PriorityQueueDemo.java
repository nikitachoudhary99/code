import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer>pq = new PriorityQueue<>();
		
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		System.out.println("pq.size():"+pq.size());
		System.out.println("pq = "+pq);
		pq.remove();
		System.out.println("After Deletion pq.size():"+pq.size());
		System.out.println("pq = "+pq);
		System.out.println("pq.peek() : "+pq.peek());

	}

}
