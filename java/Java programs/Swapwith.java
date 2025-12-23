import java.util.Scanner;
class Swapwith
{
 public static void main(String args[])
{ 
Scanner sc= new Scanner(System.in);
int a,b,c;

System.out.println("enter a:");
a=sc.nextInt();
System.out.println("enter b:");
b=sc.nextInt();


c=a;

a=b;
b=c;
System.out.println("value after swaping");
System.out.println("value of a:"+a);
System.out.println("value of b:"+b);
System.out.println("value of c:" +c);
}
}