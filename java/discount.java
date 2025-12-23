import java.util.Scanner;

public class discount 
{ public static void main(String[] args)
     {  
        float  uprice , nprice , amt , dis ;
        int qty;
        Scanner sc=new Scanner(System.in);

        System.out.println("unit price=");
        uprice=sc.nextFloat();
       
        System.out.println("quantity=");
        qty=sc.nextInt();
        amt=uprice*qty;
        dis=0;
        if(amt <500)
        {
          System.out.println("no discont available");  
        }
        else if(amt <=500 && amt <1000)
        {
            System.out.println("discount 10%=" +(0.10f * amt));
        }
        else if(amt >=1000 && amt <2000)
        {
            System.out.println("discount 20%="+(0.20f * amt));
        }
        else if(amt >=2000)
        {
            System.out.println("discount 30%="+(0.30f * amt));
        }
      
        nprice = amt - dis;
        System.out.println("net amount=  "  +nprice);
        System.out.println("unit price=  " +uprice);
        System.out.println("quantity=  "   +qty);
        System.out.println("amount=  "  +amt);
        
        


    
    }
    

}
