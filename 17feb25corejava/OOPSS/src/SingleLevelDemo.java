class AA
{
	void show()
	{
		System.out.println("India");
	}
}
class BB extends AA
{
	void show1()
	{
		System.out.println("M.P.");
	}
}
public class SingleLevelDemo {

	public static void main(String[] args) {
		
		AA a = new AA();
		BB b = new BB();
		
		a.show();
		
		b.show();
		b.show1();

	}

}
