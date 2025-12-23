//stack->work in LIFO manner

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> animals=new Stack<>();
		animals.push("lion");
		animals.push("Horse");
		animals.push("cat");
		animals.push("Dog");
		animals.push("dear");
		animals.push("tiger");
		System.out.println("stack"+animals);
		System.out.println(animals.peek());
		animals.push("lion");
		System.out.println("stack"+animals);
		System.out.println(animals.pop());
		System.out.println(animals.isEmpty());
		
		
		
		

	}

}
