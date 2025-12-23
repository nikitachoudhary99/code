class Throws1
{
	void method(int x)throws Exception
	{
			int a = 123/x;
			System.out.println("a = "+a);
			if(x==1)
			{
				int ar[]= {1,2,3};
				ar[4]=546;
			}
			if(x==2)
			{
				String s = "134s";
				int y = Integer.parseInt(s);
			}
	}
}
public class ThrowsDemo2 {

	public static void main(String[] args) {
		
		Throws1 t = new Throws1();
		try {
			t.method(2);	
		} 
		catch (Exception e) 
		{
			System.out.println("catch second time:"+e);
		}
		
		System.out.println("Bye...........!");

	}

}
