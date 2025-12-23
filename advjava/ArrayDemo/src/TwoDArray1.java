import java.util.Scanner;

public class TwoDArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		int i = 0,j=0;
		System.out.println("Enter 3*3 matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
		        arr[i][j]=sc.nextInt();	
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println(arr[i][j]+" ");     
			}
		}
				//for reverse arry
	   System.out.println("print reverse array");
		for(i=2;i>=0;i--)
		{
			for(j=2;j>=0;j--)
			{
				System.out.println(arr[i][j]);
			}
	     }
		
		//sum of each row
		
		System.out.println("sum of each row");
		for(i=0;i<3;i++)
		{int sum=0;
			for(j=0;j<3;j++)
			{
			 sum=sum+arr[i][j];	
			}
			System.out.println("sum="+sum);
		}
		
	//sum of each coln
		
		System.out.println("sum of each colon");
		for(i=0;i<3;i++)
		{int colsum=0;
			for(j=0;j<3;j++)
			{
				colsum=colsum+arr[i][j];	
			}
			System.out.println("colsum"+(j+1)+"="+colsum);
		}


	}

}
