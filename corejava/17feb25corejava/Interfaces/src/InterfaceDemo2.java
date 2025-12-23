interface Square
{
	int p=2;
	double square(double x);
}
class SquareImpl implements Square
{

	@Override
	public double square(double x) {
		//p = 4;
		return Math.pow(x, p);
	}
	
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		
		SquareImpl s = new SquareImpl();
		System.out.println("Square = "+s.square(5));

	}

}
