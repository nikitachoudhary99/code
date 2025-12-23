import java.util.Scanner;
class Swap
{
 public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
 int a,b;
 System.out.println("enter a:");
 a=sc.nextInt();
 System.out.println("enter b:");
 b= sc.nextInt();

a=a+b;
b=a-b;
a=a-b;

System.out.println("after swaping value of a: "+a);
System.out.println("after swaping value of b: "+b);
}
}