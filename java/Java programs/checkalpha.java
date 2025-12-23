import java.util.Scanner;
public class checkalpha
 {
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        char character;
        System.out.println("enter any character");
        character=obj.next().charAt(0);
        if(character>='A' && character<='Z' )
        {
            System.out.println("your character is capital");
        }
        else if(character>='a' && character<='z')
        {
            System.out.println("your character is small");
        }
        else
         {
              System.out.println("its not alphabet");
        }
        
        
    }
}
