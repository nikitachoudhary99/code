class Pattern1Demo
{
public static void main(String args[])
{
int i,j;
i=1;
while(i<=5 )
{
	j=i;
	while(j<=5)
	{
	System.out.print(" ");
	j++;
	}
	j=1;
	while( j<=i)
	{
	System.out.print("* ");	
	j++;
	}
	i++;
	System.out.println();
}
}
}
