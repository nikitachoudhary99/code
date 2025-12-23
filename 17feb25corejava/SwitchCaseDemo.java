import java.util.Scanner;

class SwitchCaseDemo
{
public static void main(String args[])
{
int a,b,c,choice,n=1;
Scanner s = new Scanner(System.in);
while(n==1)
{
System.out.println("What Do U Want : ");
System.out.println("Add : 1\nSub : 2\nMulti:3\nDiv : 4 : ");
System.out.println("Enter your choice : ");
choice = s.nextInt();
System.out.print("Enter first value:");
a = s.nextInt();
System.out.print("Enter second value:");
b = s.nextInt();

switch(choice)
{
	case 1:
		c = a+b;
		System.out.println("Sum = "+c);
		break;
	case 2:
		c = a-b;
		System.out.println("Diff = "+c);
		break;
	case 3:
		c = a*b;
		System.out.println("Product = "+c);
		break;
	case 4:
		c = a/b;
		System.out.println("Quotient = "+c);
		break;
	default:
		System.out.println("W R O N G  C H O I C E");
		
}
System.out.println("Do U Want To Continue[y=1/n=0]:");
n = s.nextInt();
}
}
}
