import java.util.Scanner;
class Tempreture
{
public static void main(String args[]){
 
Scanner sc=new Scanner(System.in);
float c,f;
 
System.out.println("enter Celsius:");
c=sc.nextFloat();
f=((c*9)/5)+32;
System.out.println("Fahrenheit is:" +f);
}
}