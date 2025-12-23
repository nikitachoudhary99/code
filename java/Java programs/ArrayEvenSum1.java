import 	java.util.Scanner;

class ArrayEvenSum1
{
  public static void main(String args[])
{
 int i,n,sum=0,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n ");
n= sc.nextInt();
int a[]=new int[n];

System.out.println("enter "+n);
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
if(a[i]% 2==0)
{ 
 System.out.println("even no "+a[i]);
 sum=sum+a[i];
 count++;

}
}
System.out.println("sum of even no :"+sum);
System.out.println("count of even no :"+count);

}
}