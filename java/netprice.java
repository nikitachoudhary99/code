//calculate net price
import java.util.Scanner;

//calculate net price
public class netprice
{
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        int nprice,uprice,qty;
        System.out.println("enter unit price ,quantity");
        uprice=obj.nextInt();
        qty=obj.nextInt();
        nprice=qty*uprice;
        System.out.println("net price ="+nprice);

    }
}
