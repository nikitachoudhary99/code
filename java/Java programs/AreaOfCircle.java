import java.util.Scanner;
class AreaOfCircle
{
 public static void main(String args[])
{
 Scanner obj=new Scanner(System.in);
 float area,r;
 
 System.out.println("enter the value of r:" );
 r=obj.nextFloat();
 
 area=3.14f*r*r;
 System.out.println("area of circle :" + area);

}
}