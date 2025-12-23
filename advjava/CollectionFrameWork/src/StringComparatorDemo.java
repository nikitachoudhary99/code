import java.util.Comparator;
import java.util.TreeSet;

class StringCmp implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
		
		String first = (String)obj1;
		String second = (String)obj2;
		
		//int diff = first.compareTo(second);
		int diff = second.compareTo(first);
		return diff;
	}
	
}
public class StringComparatorDemo {

	public static void main(String[] args) {
	
		StringCmp cmp = new StringCmp();
		TreeSet<String>ts = new TreeSet<>(cmp);
		
		ts.add("Reeta");
		ts.add("Ankit");
		ts.add("Shyam");
		ts.add("Geeta");
		ts.add("Meeta");
		ts.add("Babbita");
		ts.add("Seeta");
		
		System.out.println(ts);

	}

}