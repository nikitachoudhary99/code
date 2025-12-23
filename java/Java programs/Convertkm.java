
import java.util.Scanner;

public class convertkm 
{ public static void  main(String[] args)
    {  
        Scanner sc=new Scanner(System.in);
        float km,mtr;
        System.out.println("enter distance in mtr");
        mtr=sc.nextFloat();
        km=mtr/1000;
        System.out.println("mtr is equal to km="+km);


    }
    
}
