import java.util.Scanner; 
class Piramid
{
   public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   int i ,j,n;
System.out.println("enter n");
n=sc.nextInt();

 for(i=1;i<=n;i++)
    {
        for(j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(j=1;j<=(2*i-1);j++)
        {
            System.out.print("*");
        }
System.out.println(" ");
}
}
}