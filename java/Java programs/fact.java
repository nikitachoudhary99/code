import java.util.Scanner;
public class fact 
{
    public static void main(String[] args) 
    {
        int num,fact1=1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        num=sc.nextInt();
        
        for( i=1;i<=num;i++)
        {
           fact1=fact1*i;
        }
        System.out.println("factorial of number is =" + fact1 );
        
        
        for(int j=1;j<=10;j++)
        {
        fact1=num*j;
        System.out.println(num+ "*" +j +"="+fact1 );
        }
    }
}
