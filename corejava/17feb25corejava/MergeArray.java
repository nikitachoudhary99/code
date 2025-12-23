import java.util.Scanner;
class MergeArray
{
public static void main(String args[])
{
int size1,size2,i,j,t;
Scanner s = new Scanner(System.in);
System.out.println("Enter size of first array :");
size1 = s.nextInt();
System.out.println("Enter size of second array :");
size2 = s.nextInt();
int a[] = new int[size1];
int b[] = new int[size2];
int c[] = new int[size1+size2];
System.out.println("Enter "+size1+" values :");
for(i=0; i<size1; i++)
{
a[i] = s.nextInt();
}
System.out.println("Enter "+size2+" values :");
for(i=0; i<size2; i++)
{
b[i] = s.nextInt();
}

for(i=0; i<size1; i++)
{
c[i] = a[i];
}

for(j=0; j<size2; j++)
{
c[i] = b[j];
i++;
}

System.out.println("Output : ");
for(i=0; i<size1+size2; i++)
{
System.out.println("c["+i+"]="+c[i]);
}
}
}
