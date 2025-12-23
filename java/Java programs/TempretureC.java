import java.util.Scanner;
class TempretureC
{
public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
  float c,f;

System.out.println(" enter Fahrenheit:");
f=sc.nextFloat();
c=(f-32)*5/9;

System.out.println("Celsius is:" +c);
}
}