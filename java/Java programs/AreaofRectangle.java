import java.util.Scanner;
class AreaofRectangle
{
  public static void main(String args[])
{ 
 Scanner sc=new Scanner(System.in);
 float area,length,width;

System.out.println("enter length");
length=sc.nextFloat();

System.out.println("enter width");
width=sc.nextFloat();

area=length*width;
System.out.println("area of rectangle:" +area);

}
}