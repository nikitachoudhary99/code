import java.util.Scanner;

class ArrayDemo2
{
public static void main(String args[])
{
int size;
Scanner s = new Scanner(System.in);
System.out.println("Enter size of array : ");
size = s.nextInt();
int a[] = new int[size];
int i;
System.out.println("Enter "+size+" values :");
for(i=0; i<size; i++)
{
a[i] = s.nextInt();
}
for(i=0; i<size; i++)
{
System.out.println("a["+i+"]="+a[i]);
}

}
}

/*
1.find sum of all array values.
2.print only even value of array.
3.print only odd value of array.
4.reverse values in array.
5.array addition
6.array merging
7.array searching
8.array sorting



*/
