import java.util.Scanner;
public class averageint
{
    public static void main(String[] args) {
        {
            Scanner obj=new Scanner(System.in);
            int a,b,c,avrg;
            System.out.println("enter th value of a,b,c");
            a=obj.nextInt();
            b=obj.nextInt();
            c=obj.nextInt();
            avrg=(a+b+c)/3;
            System.out.println("average of 3 int =" +avrg);
        }
    }
}