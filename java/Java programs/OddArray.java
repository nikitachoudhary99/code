import java.util.Scanner;

class OddArray
{
 public static void main(String args[])
{
  int i,n,sum=0,count=0;
  Scanner sc= new Scanner(System.in);
  System.out.println("enter n");
  n=sc.nextInt();
 int a[]=new int[n];
 System.out.println("enter" +n+ "value ");
 for(i=0;i<n;i++)
{
 a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
 if(a[i]%2!=0)
{
 System.out.println("odd no:"+a[i]);
 sum=sum+a[i];
count++;
}
}
System.out.println("sum of odd no "+sum);
System.out.println("count of odd no "+count);
  
}
}