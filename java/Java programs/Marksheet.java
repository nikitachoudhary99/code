import java.util.Scanner;
public class marksheet 

{ public static void main(String[] args) 
    {
      int m1,m2,m3,per;
      System.out.println("m1,m2,m3");
      Scanner sc=new Scanner(System.in);
      m1=sc.nextInt();
      m2=sc.nextInt();
      m3=sc.nextInt();
      per=((m1+m2+m3)*100)/300;
      System.out.println("per"+per);
    }
    
}
