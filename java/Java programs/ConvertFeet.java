import java.util.Scanner;
class ConvertFeet
{
 public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
float inch,feet;

System.out.println(" enter inch :");
inch=sc.nextFloat();

feet=inch/12;
System.out.println("feet:" +feet);

}
}