 import java.util.Scanner;
class ArrayAdd
{
 public static void main(String args[])
{ 
  int size;
 Scanner sc= new Scanner(System.in);
 System.out.println("enter the value of array");
size=sc.nextInt();
 int arr1[]= new int[size];
 int arr2[]= new int[size];
int arr3[]= new int[size];

for(int i=0;i<size;i++)
{
 System.out.println("enter value of arr1");
 arr1[i]=sc.nextInt();
}
for(int i=0;i<size;i++)
{
 System.out.println("enter value of arr2");
 arr2[i]=sc.nextInt();
}
 
for(int i=0;i<size;i++)
{
arr3[i]=arr1[i]+arr2[i]; 
System.out.println("arr3["+i+"]="+arr3[i]);
}
}
}