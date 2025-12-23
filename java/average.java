
import java.util.Scanner;

public class average 
{public static void main(String args[])
    {
      
        int a,b,c,avrg;
        System.out.println("a,b,c");
        Scanner obj= new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        avrg=(a+b+c)/3;
        System.out.println("avrg"+avrg);

    }
    
}
