import java.util.Scanner;
public class oneDarray
 {
    public static void main(String[] args)
     {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("enter element of array");
        for(i=0;i<=4;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.println("elements of array:     ");
        for(i=0;i<=4;i++)
        System.out.print(a[i]+"  ");

    }


}
