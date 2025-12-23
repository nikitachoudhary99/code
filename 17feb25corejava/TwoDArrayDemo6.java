import java.util.Scanner;

class TwoDArrayDemo6
{
public static void main(String args[])
{
int r,c;
int i,j;
Scanner s = new Scanner(System.in);
System.out.println("Enter no of rows :");
r = s.nextInt();
int a[][] = new int[r][];
for(i=0; i<r; i++)
{
System.out.println("Enter no of columns in "+i+" Row :");
c = s.nextInt();
a[i] = new int[c];
}


for(i=0; i<r; i++)
{
System.out.println("Enter "+a[i].length+" values :");
	for(j=0; j<a[i].length; j++)
	{
	a[i][j] = s.nextInt();
	}
}	
System.out.println("Output :");			
for(i=0; i<r; i++)
{
	for(j=0; j<a[i].length; j++)
	{
	System.out.print(a[i][j]+" ");
	}
	System.out.println();	
}				
}
}
/*
1.print 3*3 2-D array in input reverse order.
2.find sum of each row in 4*4 2-D.
3.find sum of each col in 4*4 2-D.
4.find greatest value in each row in 3*4 2-D.
5.find smallest value in each row in 3*4 2-D.
6.metrix addition in 3*3.
7.transpose of 3*3 2-Array

*/
