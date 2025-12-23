import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq=new ArrayDeque<>();
		adq.add(20);
		adq.add(30);
		adq.add(40);
		adq.add(50);
		adq.add(10);
		adq.offer(20);
		System.out.println("ArrayDeque="+adq);
		System.out.println("peekFirst="+adq.peekFirst());
		System.out.println("peekLast"+adq.peekLast());
		System.out.println("poll="+adq.poll());
		
		System.out.println("pollFirst"+adq.pollFirst());
		System.out.println("pollLast="+adq.pollLast());
		System.out.println(adq);
	}

}
