class AdditionDemo
{
public static void main(String args[])
{
int a=10;
int b=20;
int c;

c = a+b;
System.out.println("Sum = "+c);
System.out.println("Sum = "+a+b);
//"Sum = "+a+b->"sum = "+"10"+20->"sum = 10"+"20"->sum=1020
System.out.println("Sum = "+(a+b));
//->"sum = "+"30"->"sum=30"
System.out.println(a+b+"Sum = ");
//a+b+"Sum = "
}
}
/*
string + value = + is used as concatnation operator
value + value = value(addition)
Note : println() method can print only a string, and only one string at a time.

"sum = "+"30"= "sum = 30"

Note : all inputs and outputs in java are in the form of string.
*/
