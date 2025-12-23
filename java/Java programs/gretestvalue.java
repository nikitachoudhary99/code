//comand line 

public class gretestvalue 
{public static void main(String[] args) 
{
   int a,b,c;
   System.out.println("enter the value of a,b,c");
   a= Integer.parseInt(args[0]);
   b= Integer.parseInt(args[1]);
   c= Integer.parseInt(args[2]);
   
   if(a>b && a>c)
   {
    System.out.println("a is greater");
   }
   else if(b>a && b>c)
   {
    System.out.println("b is greter");
   }
   else  
   {
    System.out.println("c is greter");
   }

}
    
}
