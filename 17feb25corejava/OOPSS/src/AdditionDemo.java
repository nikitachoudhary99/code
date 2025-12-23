import java.util.Scanner;

class Addition
{
	int a;  //instance var
	int b;
	void getData()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a:");
		a = s.nextInt();
		System.out.println("Enter value of b:");
		b = s.nextInt();
	}
	void calculate()
	{
		int c;  //local var of calculate method
		c = a+b;
		System.out.println("Sum = "+c);
	}
}
public class AdditionDemo {

	public static void main(String[] args) {
		Addition ad1 = new Addition();
		ad1.getData();
		Addition ad2 = new Addition();
		ad2.getData();
		
		ad1.calculate();
		ad2.calculate();
		
	}

}
