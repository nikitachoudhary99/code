import java.util.Scanner;
public class vovel
{
   public static void main(String[] args)
    {
       char vovel;
       Scanner obj=new Scanner(System.in);
       System.out.println("enter any value");
       vovel=obj.next().charAt(0);
       if(vovel =='a'||vovel =='e'||vovel =='i'||vovel =='o'||vovel =='u')
       {
         System.out.println("its vowel");
       }
       else 
       {
        System.out.println("its not vowel");
       }
   } 
}
