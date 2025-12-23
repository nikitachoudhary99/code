import java.util.Scanner;

class NestedIfElse
{
public static void main(String args[])
{
double p;
Scanner s = new Scanner(System.in);
System.out.println("Enter your percentage marks : ");
p = s.nextDouble();
if(p>=60)
{
System.out.println("I Div");
}
else
{
	if(p>=45)
	{
	System.out.println("II Div");
	}
	else
	{
		if(p>=33)
		{
		System.out.println("III Div");
		}
		else
		{
		System.out.println("FAIL");
		}
	}
}
}
}

/*
1.Find greatest value in between three values.
2.find a given year is a leap year or not.
3.Book Staller

book<20	5% discount
book<50	10% discount
book<100	15% discount
book>=100 20% discount

get no of books and price of one book
25*10 = 250-25
payble amount = 225
*/


