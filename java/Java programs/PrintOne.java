// print series  of 11111 11111 11111 11111 11111
 import java.util.Scanner;
class PrintOne
{
public static  void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
int i,j,n;

 System.out.println("enetr n"  );
 n=sc.nextInt();
for(i=1;i<n;i++)
{  
for(j=1;j<i;j++)
 System.out.println("i"  );
}
System.out.println(" ");
}
}