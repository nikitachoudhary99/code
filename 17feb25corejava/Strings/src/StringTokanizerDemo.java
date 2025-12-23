import java.util.StringTokenizer;

public class StringTokanizerDemo {

	public static void main(String[] args) {
		
		String s = "101=Heet;102=Ritik;103=Yashwant;104=Vishnu;105=Jay;106=Varun";
		StringTokenizer st = new StringTokenizer(s,"=;");
		System.out.println("No of Tokens = "+st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken()+"\t"+st.nextToken());
		}
	}

}
