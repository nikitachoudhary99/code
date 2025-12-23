interface A1
{
	void show();
}
interface B1
{
	void display();
}
class ABImpl implements A1,B1
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
public class InterfaceDemo4 {

	public static void main(String[] args) {
		
		ABImpl b = new ABImpl();
		b.show();
		b.display();

	}

}
