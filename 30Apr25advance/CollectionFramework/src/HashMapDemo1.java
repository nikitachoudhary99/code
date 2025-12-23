import java.util.HashMap;
import java.util.Map;

class Account
{
	private String name;
	private String type;
	private double bal;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String name, String type, double bal) {
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
public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<Integer, Account>hm = new HashMap<>();
		
		hm.put(101, new Account("Naina","SAving",10));
		hm.put(102, new Account("Muskan","Saving",100));
		hm.put(103, new Account("Nikita","Saving",200));
		hm.put(104, new Account("Khushi","Cur",20));
		
		System.out.println(hm);
		
		for(Map.Entry<Integer, Account> e:hm.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

	}

}
