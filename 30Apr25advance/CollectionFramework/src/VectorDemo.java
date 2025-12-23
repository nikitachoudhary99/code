import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer>v = new Vector();
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(20);
		v.addElement(50);
		v.addElement(60);
		
		System.out.println("v.size():"+v.size());
		System.out.println("v = "+v);
		
		v.remove(0);
		v.remove(new Integer(40));
		
		System.out.println("After Deletion v.size():"+v.size());
		System.out.println("v = "+v);
		
		v.set(2, 70);
		System.out.println("After Modification v.size():"+v.size());
		System.out.println("v = "+v);
		System.out.println("Display By using index loop :");
		for(int i=0; i<v.size(); i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("Display By using for-each loop :");
		for (Integer integer : v) {
			System.out.println(integer);
		}
		System.out.println("Display By using Iterator :");
		Iterator<Integer>itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Display By using Enumaration :");
		
		Enumeration<Integer>e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}
	

}
