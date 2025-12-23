import java.util.Scanner;

class TwoDArrayDemo4
{
public static void main(String args[])
{
int r,c;
Scanner s = new Scanner(System.in);
System.out.println("Enter no of rows :");
r = s.nextInt();
System.out.println("Enter no of columns :");
c = s.nextInt();
int a[][] = new int[r][c];
int i,j;
System.out.println("Enter "+(r*c)+" values :");
for(i=0; i<r; i++)
{
	for(j=0; j<c; j++)
	{
	a[i][j] = s.nextInt();
	}
}	
System.out.println("Output :");			
for(i=0; i<r; i++)
{
	for(j=0; j<c; j++)
	{
	System.out.print(a[i][j]+" ");
	}
	System.out.println();	
}				
}
}
