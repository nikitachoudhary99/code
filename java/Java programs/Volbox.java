import java.util.Scanner;
class Volbox{
 public static void main(String args[]){
 float box,length,width,hight;

Scanner sc=new Scanner(System.in);

System.out.println("enter length:");
length=sc.nextFloat();

System.out.println("enter width:");
width=sc.nextFloat();

System.out.println("enter hight:");
hight=sc.nextFloat();

box=length*width*hight;
System.out.println("volume of box:" +box);
}

}