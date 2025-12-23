
//how to create custem exception.....
class AgeInvalidException extends Exception{
   
    AgeInvalidException()
    {
        super("Age is invalid !");
    }
    AgeInvalidException(String message)
    {
        super(message);
    }

}
// class tommy extends Human{

// }
// class myFrame extends Exception{}



public class exception {
   public static void main(String[] args) {
    System.out.println("started.....");
   try{
    int n1=Integer.parseInt(args[0]);
    int n2=Integer.parseInt(args[1]);
    System.out.println("we have got two numbers....");
    int result=n1/n2;
    System.out.println("division is"+result);


    if(n2<10)
    {
        throw new AgeInvalidException("my age is invalis!");
    }
   }
   
   catch(ArithmeticException e){
   System.out.println("n2 will not declare by zero");
   System.out.println("e.getMessage()"+e.getMessage());
   }
   
   
   catch(NumberFormatException e){
    System.out.println("Invalid number...");
    System.out.println(e.getMessage());
   }
   catch(AgeInvalidException e){
    System.out.println("n2 is invalid");
    System.out.println(e.getMessage());
   }
   
   
   
   catch(Exception e){
    System.out.println("ERROR..");
    System.out.println(e.getMessage());
   }
   
   finally{
    //always work
    System.out.println("i am in finally block");
    System.out.println("closing all the resources");
   }
   
   System.out.println("ternimated");
   } 
}
