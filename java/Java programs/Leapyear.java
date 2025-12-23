import java.util.*;
class Leapyear
{
public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
  int year;
System.out.println("enter year");
year=sc.nextInt();

if(year%4==0)
{ 
System.out.println("year is a leap year");
}
else if(year%400==0)
{
System.out.println("year is a leap year");
}
else
{
System.out.println("year is not a leap year");
}
}
}