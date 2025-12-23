class Counter
{
	int count;
	Counter()
	{
		System.out.println("*****No Parameter Constructor Called*****");
		count = 0;
	}
	Counter(int count)
	{
		System.out.println("*****One Parameter Constructor Called*****");
		this.count = count;
	}
	void show()
	{
		System.out.println("Count = "+count);
	}
	void inc()
	{
		count++;
	}
	void dec()
	{
		count--;
	}
}
public class ConstDemo1 {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		c1.show();
		Counter c2 = new Counter(10);
		c2.show();
		c1.inc();
		c2.dec();
		c1.show();
		c2.show();
	}

}
