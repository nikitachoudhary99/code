import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		

		ArrayList<String> al = new ArrayList<>();
		
		al.add("Nikita");
		al.add("Naina");
		al.add("Muskan");
		al.add("Khushi");
		al.add("Ayush");
		al.add("Jay");
		al.add("Nikita");
		al.add("Vishnu");
		al.add("Ajay");
		al.add("Yashwant");
		
		System.out.println("al.size():"+al.size());
		System.out.println("al = "+al);
		
		al.add(2, "Ram");
		System.out.println("After addition : al.size() :"+al.size());
		System.out.println("al = "+al);
		
		al.remove(4);
		al.remove("Jay");
		
		System.out.println("After deletetion : al.size() :"+al.size());
		System.out.println("al = "+al);
		
		al.set(2, "Shiva");
		System.out.println("After modification : al.size() :"+al.size());
		System.out.println("al = "+al);
		
		System.out.println("Display by using index loop :");
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("Display by using for-each loop :");
		for (String string : al) {
			System.out.println(string);
		}
		System.out.println("Display by using Iterator :");
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
