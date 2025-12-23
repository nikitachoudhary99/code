import java.util.Scanner;

public class oddeven 

{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int i,n;
       System.out.println("enter the number of  element of you want to create");
       n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("enter the elements of array ");
       for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("number is even");
            }
            else
            {
                System.out.println("number is odd");
            }
            sum=sum+arr[i];

        }
        System.out.println("sum of array=" +sum);
   }

}
