abstract class Shape
{
	double dim1,dim2;
	Shape()
	{
		dim1 = 0;
		dim2 = 0;
	}
	Shape(double x,double y)
	{
		dim1 = x;
		dim2 = y;
	}
	abstract void area();
}
class Rectangle extends Shape
{
	Rectangle()
	{
		super();
	}
	Rectangle(double x,double y)
	{
		super(x,y);
	}

	@Override
	void area() 
	{
		double a;
		a = dim1*dim2;
		System.out.println("Area of rectangle = "+a);
	}
	
}
class Triangle extends Shape
{
	Triangle()
	{
		super();
	}
	Triangle(double x,double y)
	{
		super(x,y);
	}

	@Override
	void area() 
	{
		double a;
		a = dim1*dim2/2;
		System.out.println("Area of triangle = "+a);
	}
	
}
class Circle extends Shape
{
	Circle()
	{
		super();
	}
	Circle(double x,double y)
	{
		super(x,y);
	}

	@Override
	void area() 
	{
		double a;
		a = dim1*dim1*3.14;
		System.out.println("Area of Circle = "+a);
	}
	
}

public class PolyDemo2 {

	public static void main(String[] args) {
		
		Shape ref;
		Rectangle r = new Rectangle(5,8);
		Triangle t = new Triangle(10,8);
		Circle c = new Circle(4,0);
		
		ref = r;
		ref.area();
		
		ref = t;
		ref.area();
		
		ref = c;
		ref.area();

	}

}
/*
Arithmetics
a,b

calculat()

Addition<--Arithmetic
Subtraction<--Arithmetic
Multiplication<--Arithmetic
Divssion<--Arithmetic
*/