package str;

public class Test {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("sb = "+sb);
		System.out.println("sb.hashCode():"+sb.hashCode());
		
		sb.append(" Java");
		System.out.println("sb = "+sb);
		System.out.println("sb.hashCode():"+sb.hashCode());

	}

}
