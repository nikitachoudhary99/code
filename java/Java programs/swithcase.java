import java.util.Scanner;

public class swithcase
 {
    public static void main(String[] args) 
    {
        int lang;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the language you want to talk");
        System.out.println("press 1 for hindi");
        System.out.println("press 2 for english");
        System.out.println("press 3 for malvi");
        lang=sc.nextInt();


        switch(lang)
        {
           case 1:
           System.out.println("continue with hindi");
            break;

            case 2:
            System.out.println("continue with english");
            break;

            case 3:
             System.out.println("continue with malvi");
             break;

             default:
             System.out.println("invalid language");



        }
        

    }
}
