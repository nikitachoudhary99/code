class Box
{
	double l,b,h;
	Box()
	{
		System.out.println("*****No Parameter Constructor Called*****");
		l = 0;
		b = 0;
		h = 0;
	}
	Box(double l,double b,double h)
	{
		System.out.println("*****Three Parameter Constructor Called*****");
		this.l = l;
		this.b = b;
		this.h = h;
	}
	void show()
	{
		System.out.println("Length = "+l);
		System.out.println("Breadth = "+b);
		System.out.println("Height = "+h);
	}
	void volume()//prototype of method
	{
		double v;
		v = l*b*h;
		System.out.println("Volume of box = "+v);
	}
	void volume(double len)//method overloading
	{
		double v;
		l = b = h = len;
		v = l*b*h;
		System.out.println("Volume of cube = "+v);
	}
}
public class ConstDemo2 {

	public static void main(String[] args) {
		
		Box b1 = new Box();
		Box b2 = new Box(4, 5, 6);
		b1.show();
		b2.show();
		b2.volume();
		b1.volume(5);

	}

}
