import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(123.45);
		al.add("Nalayak Students");
		
		Integer a =(Integer) al.get(0);
		System.out.println(a);
		Double d = (Double)al.get(1);
		System.out.println(d);
		String s = (String)al.get(2);
		System.out.println(s);
		
		for (Object object : al) {
			System.out.println(object);
		}
		System.out.println("al = "+al);
	}

}
