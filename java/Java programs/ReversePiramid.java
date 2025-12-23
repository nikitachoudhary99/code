import java.util.Scanner;
class ReversePiramid
{
  public static void main(String args[])
{
  int i,j,n;
Scanner sc= new Scanner(System.in);
System.out.println("enter n");
n=sc.nextInt();
 for(i=n;i>=1;i--)
{
  for(j=1;j<n-i;j++)
{
   System.out.print(" "); 
}
for(j=1;j<=(2*i-1);j++){
   System.out.print("*"); 

}
    System.out.println(" "); }
}
}