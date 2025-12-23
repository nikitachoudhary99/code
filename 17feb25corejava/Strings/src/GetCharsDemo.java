
public class GetCharsDemo {

	public static void main(String[] args) {
		
		String s = "this is an example of getChars method";
		char ar[] = new char[10];
		
		s.getChars(0, 4, ar, 0);
		System.out.println(ar);
		
		System.out.println("s.startsWith(this):"+s.startsWith("this"));
		System.out.println("s.endsWith(method):"+s.endsWith("method"));
		
		System.out.println("indexOf: "+s.indexOf("a"));
		System.out.println("s.charAt(3):"+s.charAt(3));
		System.out.println("s.isEmpty():"+s.isEmpty());

	}

}
