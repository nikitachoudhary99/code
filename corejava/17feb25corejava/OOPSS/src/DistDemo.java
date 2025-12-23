
class Dist
{
	int feet;
	double inch;
	Dist()
	{
		feet = 0;
		inch = 0;
	}
	Dist(int feet,double inch)
	{
		this.feet = feet;
		this.inch = inch;
	}
	void show()
	{
		System.out.println("Feet = "+feet);
		System.out.println("Inch = "+inch);
	}
	void feetToDist(double ft)
	{
		feet = (int)ft; //2
		inch = (ft-feet)*12;
	}
	double distToFeet()
	{
		double ft;
		ft = feet+(inch/12);//2.5
		return ft;
	}
}
public class DistDemo {

	public static void main(String[] args) {
		
		Dist d1 = new Dist();
		Dist d2 = new Dist(2, 6.0);
		d1.show();
		d2.show();
		d1.feetToDist(2.25);
		d1.show();
		double x =  d2.distToFeet();
		System.out.println("Feets = "+x);
	}
}
