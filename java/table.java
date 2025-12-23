
import java.util.Scanner;



public class table 
{  
    public static void main(String[] args)
     { Scanner obj=new Scanner(System.in);
        System.out.println("enter value");
        int num,table;
        num=obj.nextInt();
        for(int i=1;i<10;i++)
        {
          table=num*i;
        
        System.out.println(num +"*"  +i+ "=" +table);
        }

        
    }
    
}
