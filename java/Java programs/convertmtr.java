import java.util.Scanner;
class Convertmtr
{
  public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
  float km,mtr;
 System.out.println("enter km");
 km=sc.nextFloat();
 mtr=km*1000;
 System.out.println("km is equal to mtr:"  + mtr);
}
}