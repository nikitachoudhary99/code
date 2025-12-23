interface Hello
{
	void sayHello();
	void goodBye();
}
class HelloImpl implements Hello
{
	@Override
	public void sayHello()
	{
		System.out.println("Hello Student's...!");
	}

	@Override
	public void goodBye() {
		
		System.out.println("Good Bye Student's....!");
	}
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		
		HelloImpl h = new HelloImpl();
		h.sayHello();
		h.goodBye();

	}

}
