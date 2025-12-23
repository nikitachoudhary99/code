import java.util.HashMap;
 
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Account11
{
	private String name;
	private String type;
	private double bal;
	public Account11() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account11(String name, String type, double bal) {
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
public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, Account11>hm = new TreeMap<>();
		hm.put(103, new Account11("Nikita","Saving",200));
		hm.put(101, new Account11("Naina","SAving",10));
		hm.put(104, new Account11("Khushi","Cur",20));
		hm.put(102, new Account11("Muskan","Saving",100));
		System.out.println(hm);
		
		for(Map.Entry<Integer, Account11> e:hm.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

	}

}