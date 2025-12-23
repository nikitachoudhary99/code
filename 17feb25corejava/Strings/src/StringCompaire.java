
public class StringCompaire {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Good Bye";
		String s4 = "HELLO";
		
		System.out.println(s1+" equals "+s2+" = "+s1.equals(s2));//Compare value
		System.out.println(s1+" equals "+s3+" = "+s1.equals(s3));
		System.out.println(s1+" equals "+s4+" = "+s1.equals(s4));
		System.out.println(s1+" equalsIgnoreCase "+s4+" = "+s1.equalsIgnoreCase(s4));
		
		System.out.println(s1+" compareTo "+s2+" = "+s1.compareTo(s2));//Compare value
		System.out.println(s1+" compareTo "+s3+" = "+s1.compareTo(s3));
		System.out.println(s1+" compareTo "+s4+" = "+s1.compareTo(s4));
		System.out.println(s1+" compareToIgnoreCase "+s4+" = "+s1.compareToIgnoreCase(s4));
		
		String st = "abcd";
		String st1 = new String(st);
		System.out.println(st+" == "+st1+" :" +(st==st1));//compare address
		
		String st2 = st;
		System.out.println(st+" == "+st2+" :" +(st==st2));//compare address

	}

}
