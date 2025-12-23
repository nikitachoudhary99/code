import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDqueDemo {

	public static void main(String[] args) {

		
		ArrayDeque<String>adq = new ArrayDeque<>();
		adq.add("Radhe");
		adq.add("Mohan");
		adq.add("Ankit");
		adq.add("Meeta");
		adq.add("Babblu");
		adq.add("Dabblu");
		
		System.out.println("adq.size():"+adq.size());
		System.out.println(adq);
		
		adq.addFirst("GEET");
		adq.addLast("HEET");
		
		System.out.println("After Addition adq.size():"+adq.size());
		System.out.println(adq);
		
		System.out.println("adq.getFirst():"+adq.getFirst());
		System.out.println("adq.getLast():"+adq.getLast());
		
		adq.removeFirst();
		adq.removeLast();
		
		System.out.println("After deletion adq.size():"+adq.size());
		System.out.println(adq);
		
	}

}
