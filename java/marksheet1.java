import java.util.Scanner;
public class marksheet1 
{
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        String name;
        String division;
        int roll;
       // string phy,che,mth,eng,hin;
        float m1,m2,m3,m4,m5;

        float total,per;
        for(int i=1;i<=5;i++)
        {
            System.out.println("enter student name");
            name=sc.next();
            System.out.println("enter student roll no");
            roll=sc.nextInt();
            //System.out.println("enter student subject");
            //phy=sc.next();


            System.out.println("enter student marks of m1");
           m1 =sc.nextFloat();
           System.out.println("enter student marks of m2");
           m2 =sc.nextFloat();
           System.out.println("enter student marks of m3");
           m3 =sc.nextFloat();
           System.out.println("enter student marks of m4");
           m4 =sc.nextFloat();
           System.out.println("enter student marks of m5");
           m5 =sc.nextFloat();

           total=m1+m2+m3+m4+m5;
           System.out.println("total marks of all 5 sub is= " +total);

           per=(total*100)/500;
           System.out.println("percent ="+per);
    
           
           if (per>= 75)
             {
               division = "1st Division";
             } 
           else if (per >= 65) 
            {
            division = "2nd Division";
            } 
            else if (per>= 45) 
            {
             division = "3rd Division";
            } 
            else 
            {
             division = "Fail";
            }
            System.out.println("devision = " +division);
        }
    
        
        

        
        
        
    }

}
