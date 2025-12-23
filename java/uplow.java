
import java.util.Scanner;

public class uplow
 {
    public static void main(String[] args) 
    {
       Scanner obj=new Scanner(System.in);
       char a,b;
       System.out.println("enter values");
       a=obj.next().charAt(0);
       b=obj.next().charAt(0);
         if (a-b==32||b-a==32||a==b) {
            System.out.println("is valid");
         }
         else{
            System.out.println("is invalid");
         }
    }

}
