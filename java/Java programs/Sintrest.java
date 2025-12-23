
import java.util.Scanner;
class Sintrest
{
  public static void main(String args[])
{ 
  Scanner sc=new Scanner(System.in);
  float si,p,r,t;

System.out.println("enter price");
p=sc.nextFloat();

System.out.println("enter rate");
r=sc.nextFloat();

System.out.println("enter time");
t=sc.nextFloat();

si=(p*r*t)/100;
System.out.println("simple intrest:" +si);


}
}