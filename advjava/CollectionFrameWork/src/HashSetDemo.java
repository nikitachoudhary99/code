import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("Nakul");
		set.add("Deepak");
		set.add("Neeta");
		set.add("Geeta");
		set.add("Nakul");
		set.add("Reeta");
		
		System.out.println("set.size():"+set.size());
		System.out.println("set = "+set);
		
		set.remove("Geeta");
		System.out.println("After Deletion set.size():"+set.size());
		System.out.println("set = "+set);
		
		for (String string : set) {
			System.out.println(string);
		}
		Iterator<String>itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
