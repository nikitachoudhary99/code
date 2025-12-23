import java.util.Scanner;
class RevArray
{
public static void main(String args[])
{
int size,i,j,t;
Scanner s = new Scanner(System.in);
System.out.println("Enter size of array :");
size = s.nextInt();
int a[] = new int[size];
System.out.println("Enter "+size+" values :");
for(i=0; i<size; i++)
{
a[i] = s.nextInt();
}
j=size-1;
for(i=0; i<size/2; i++)
{
t = a[i];
a[i] = a[j];
a[j] = t;
j--;
}
System.out.println("Output : ");
for(i=0; i<size; i++)
{
System.out.println("a["+i+"]="+a[i]);
}
}
}
