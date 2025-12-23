import java.util.Scanner;
class Prime
{
  public static void main(String args[])
{
  int i,n,count=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter n");
n=sc.nextInt();
  for(i=2;i<n/2;i++)
{
System.out.print("");
}


if(n%i==0)
{
System.out.println(" given no is prime no.");
}
else
{
System.out.println(" given no is not prime no.");

}
}
}