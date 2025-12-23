import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer>hm = new HashMap<>();
		hm.put("radhe", 12000);
		hm.put("Keshav", 15000);
		hm.put("radhe", 18000);
		hm.put("Ankit", 20000);
		hm.put("Rahul", 20000);
		
		System.out.println(hm);
		hm.remove("Rahul");
		System.out.println(hm);
		
		System.out.println("Display by using for-each loop:");
		for(Map.Entry<String, Integer>e : hm.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		

	}

}
