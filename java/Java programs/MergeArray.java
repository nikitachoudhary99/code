//two array merge in one array

import java.util.Scanner;
class MergeArray
{
  public static void main(String args[])
{  
	Scanner sc= new Scanner(System.in);
	int size1,size2,i;
	System.out.println("enter the size of array1");
	size1=sc.nextInt();

	int arr1[]=new int[size];
	int arr2[]=new int[size];

	for(i=0;i<size1;i++)
	{
		System.out.println("enter the value of arr1");
		arr1[i]=sc.nextInt();
	}
	for(i=0;i<size2;i++)
	{
		System.out.println("enter the value of arr2");
		arr2[i]=sc.nextInt();
	}
	int temp[]=new int[size1+size2];
	System.out.println("Third Array:");
	for (i = 0; i < size; i++) {
            temp[i] = arr1[i];         
            temp[i + size] = arr2[i];
	for (int j = 0; j < size; j++)  
		System.out.println(temp[i]+" ");  
	}
	}
}