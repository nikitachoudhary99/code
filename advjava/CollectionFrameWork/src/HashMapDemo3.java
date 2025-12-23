import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;

class Account10
{
	private String name;
	private String type;
	private double bal;
	public Account10() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account10(String name, String type, double bal) {
		super();
		this.name = name;
		this.type = type;
		this.bal = bal;
	}
	@Override
	public String toString() {
		return name + "\t" + type + "\t" + bal+"\n";
	}
	
}
public class HashMapDemo3 {

	public static void main(String[] args) {
		
		HashMap<Integer, Account10>hm = new HashMap<>();
		
		hm.put(101, new Account10("Naina","Saving",10));
		hm.put(102, new Account10("Muskan","Current",100));
		hm.put(103, new Account10("Nikita","Saving",200));
		hm.put(104, new Account10("Khushi","Current",20));
		hm.put(100, new Account10("Naina","Saving",10));
		
		System.out.println(hm);
		
		for(Entry<Integer, Account10> e:hm.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

	}

}