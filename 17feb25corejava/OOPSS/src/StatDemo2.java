
class Stat1
{
	int id;
	static int count;
	Stat1()
	{
		count++;
		id = count;
	}
	static void show()
	{
		//System.out.println("Id = "+id);
		System.out.println("Count = "+count);
	}
	void showId()
	{
		System.out.println("Id = "+id);
	}
}
public class StatDemo2 
{
	public static void main(String[] args) 
	{
		Stat1 s1 = new Stat1();
		s1.showId();
		Stat1.show();
		
		Stat1 s2 = new Stat1();
		Stat1 s3 = new Stat1();
		
		s2.showId();
		s2.show();
		
		s3.showId();
		Stat1.show();
		
	}

}
