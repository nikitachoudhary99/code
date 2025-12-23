
import java.util.Scanner;
public class ArraySize 
{
    public static void main(String[] args) 
    {
            
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=obj.nextInt();


        int i;
        int a[]=new int[size];
        System.out.println("enter"  +size+  "elements of array");
        for(i=0;i<size;i++)
        {
            a[i]=obj.nextInt();


            System.out.println("enter"  +size+  " elements of array");
            for(i=0;i<size;i++)
            {
                System.out.print(a[i]+   "  ");
               }
          obj.close();
        }
        
    }
}
