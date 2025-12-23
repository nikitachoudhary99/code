
import java.util.Scanner;

class ReverseDemo
{
public static void main(String args[])
{
int r=0,n,i;
Scanner s = new Scanner(System.in);
System.out.println("Enter a value : ");
n = s.nextInt();

for(i=n; i>0; i=i/10)
{
r = r*10;
r = r+(i%10);
}
System.out.println("Reverse = "+r);
}
}
