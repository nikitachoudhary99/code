import java.util.Scanner;
class Areaoftriangle

{
 public static void main(String args[])
{
 float t,b,h;
 Scanner sc= new Scanner(System.in);
 System.out.println(" enter base:");
 b=sc.nextFloat();
 
System.out.println("enter hight:");
h=sc.nextFloat();

t=1/2*(b*h);
System.out.println("area of triangle:" +t);
}
}
