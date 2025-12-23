import java.util.Scanner;
class ConvertInch
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
float inches,feet;
 System.out.println("enter feet:");
feet=sc.nextFloat();
inches=feet*12;
System.out.println("inches:" + inches);
}
}