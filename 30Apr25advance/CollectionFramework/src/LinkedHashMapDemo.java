import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Account1
{
	private String name;
	private String type;
	private double bal;
	public Account1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account1(String name, String type, double bal) {
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
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Account1>hm = new LinkedHashMap();
		hm.put(103, new Account1("Nikita","Saving",200));
		hm.put(101, new Account1("Naina","SAving",10));
		hm.put(104, new Account1("Khushi","Cur",20));
		hm.put(102, new Account1("Muskan","Saving",100));
		System.out.println(hm);
		
		for(Map.Entry<Integer, Account1> e:hm.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

	}

}
