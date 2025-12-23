import java.util.Scanner;
public class reverse 
{ public static void main(String[] args)
     { 
        Scanner sc=new Scanner(System.in);
        int value,sum=0,rev=0,rem;
        System.out.println("enter the value");
       value=sc.nextInt();

       while(value>0)
       {
        rem=value%10;
        rev=rev*10+sum;
        value=value/10;
        }
        System.out.println("reverse the value"+rev);
    }
    

}
