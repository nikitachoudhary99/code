import java.util.Scanner;

public class gretest
 { public static void main(String[] args)
 {
    int a,b;
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the value of a,b");
    a=obj.nextInt();
    b=obj.nextInt();
    if(a>b)
    {
        System.out.println("a is greater");

    }
    else
    {
        System.out.println("b is greater");
    }

 }
    

}
