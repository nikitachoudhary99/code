import java.util.Scanner;

class Account
{
	int accno;  //data members of class
	String name;
	double bal;
	void openAcc()//member methods of class
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter accno : ");
		this.accno = s.nextInt();
		//this : it is a  reference object of class store reference
		//of current running object
		System.out.println("Enter name : ");
		name = s.next();
		System.out.println("Enter balance :");
		this.bal = s.nextDouble();
	}
	void enq()
	{
		System.out.println("Accno = "+accno);
		System.out.println("Name = "+this.name);
		System.out.println("Balance = "+bal);
	}
	void deposit()
	{
		int amt;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount to be deposit : ");
		amt = s.nextInt();
		bal = bal+amt;
		System.out.println("Current balance :"+bal);
	}
	void withdraw()
	{
		int amt;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount to be withdraw : ");
		amt = s.nextInt();
		bal = bal-amt;
		System.out.println("Remaining balance :"+bal);
	}
}
public class AccountDemo 
{
	public static void main(String[] args) 
	{
	System.out.println("Hello Main......!");
	Account a1 = new Account();
	a1.openAcc();
	Account a2 = new Account();
	a2.openAcc();
	
	a1.enq();
	a2.enq();
	
	a1.deposit();
	a2.withdraw();
	}

}
/*
Class Student
roll
name
pmarks
cmarks
mmarks
getData()
showData()
total()
percentage()
grade()


*/