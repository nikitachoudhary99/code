import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	List<Integer> list=new ArrayList();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	System.out.println("list ="+list);
	list.add(60);
	list.remove(3);
	System.out.println("list ="+list);
	list.add(70);
	System.out.println("to get element by index "+list.get(3));
	list.remove(Integer.valueOf(30));
	list.clear();

	}

}
