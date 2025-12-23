interface A
{
	void show();
}
interface B extends A
{
	void display();
}
class BImpl implements B
{

	@Override
	public void show() {
	
		System.out.println("Inside show");		
	}

	@Override
	public void display() {
		
		System.out.println("inside Display");		
	}
	
}
public class InterfaceDemo3 {

	public static void main(String[] args) {
		
		BImpl b = new BImpl();
		b.show();
		b.display();

	}

}
