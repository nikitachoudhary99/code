import java.util.Scanner;
class ArrayWithForEach
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
System.out.println("Display Array By For-Each Loop :");
for(int x : a)
{
System.out.println(x);
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
