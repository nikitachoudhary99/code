
import java.util.Scanner;

public class array
 { public static void main(String[] args) 
 {
   Scanner sc=new Scanner(System.in);
   int a[];
   
   a = new int [5];int i;

   System.out.println("enter the element of array");
   for(i=0;i<=4;i++)
   a[i]=sc.nextInt();
   System.out.print("element of array      ");
   for(i=0;i<=4;i++)
   System.out.println(a[i] + "  ");


   
    



 }
    
}
