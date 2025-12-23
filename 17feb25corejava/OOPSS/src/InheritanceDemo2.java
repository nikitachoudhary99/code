import java.util.Scanner;

class Person1
{
	String name;
	String address;
	void getData()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name : ");
		name = s.next();
		System.out.println("Enter Address : ");
		address = s.next();
	}
	void showData()
	{
		System.out.println("Name = "+name);
		System.out.println("Address = "+address);
	}
}
class Employee1 extends Person1
{
	int empId;
	double salary;
	void getData()
	{
		super.getData();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter empId : ");
		empId = s.nextInt();
		System.out.println("Enter salary : ");
		salary = s.nextDouble();
	}
	void showData()
	{
		super.showData();
		System.out.println("EmpId = "+empId);
		System.out.println("Salary :"+salary);
	}
}
public class InheritanceDemo2 {

	public static void main(String[] args) {
		
		Employee1 e = new Employee1();
		e.getData();
		
		e.showData();
		
	}

}
/*
Person
name
address
getData()
showData()


Employee<--Person
empid
salary
getData1()
showData1()

Student<--Person
roll
marks
getData2()
showData2()

Manager<--Employee
mgrid
dept
getData3()
showData3();
*/

