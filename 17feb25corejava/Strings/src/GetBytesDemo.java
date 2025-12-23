import java.util.Iterator;

public class GetBytesDemo {

	public static void main(String[] args) {
		
		byte b[] = {65,66,67,68,69,70};
		
		String s = new String(b);
		System.out.println(s);
		String s1 = new String(b,2,3);
		System.out.println(s1);
		
		byte bt[] = s1.getBytes();
		for (int i = 0; i < bt.length; i++) {
			System.out.println(bt[i]);
		}

	}

}
