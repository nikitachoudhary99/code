import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;


public class LinkedListDemo {
public static void main(String[] args) {

		List<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(33);
		list.add(30);
		System.out.println("list="+list);
		//we can add arrayList also
		list.add(3, 40);
		List<Integer> list1=new ArrayList<>();
		list1.add(50);
		list1.add(90);
		list1.addAll(list);
		System.out.println(list);
	}

}
