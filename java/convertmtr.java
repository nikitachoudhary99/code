//convert mtr to km
import java.util.Scanner;
public class convertmtr
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        float mtr,km;
        System.out.println("enter distance in km");
        km=obj.nextFloat();
        mtr=km*1000;
        System.out.println("km is equal to mtr is "+mtr);


    }
} 
