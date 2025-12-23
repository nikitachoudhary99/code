
import java.util.Scanner;

public class sumeven 
{ public static void main(String[] args) 
    {   Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("enter the number of array element");

         n= sc.nextInt();
        int arr[]=  new int[n];
        System.out.println("enter the element of array");

       for(i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
       int sum=0;

       for ( i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) {
            sum += arr[i];
        }
    }
    System.out.println("sum of even numbers="+sum);


    
}
    
}
