import java.util.Scanner;

class Person
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
class Employee extends Person
{
	int empId;
	double salary;
	void getData1()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter empId : ");
		empId = s.nextInt();
		System.out.println("Enter salary : ");
		salary = s.nextDouble();
	}
	void showData1()
	{
		System.out.println("EmpId = "+empId);
		System.out.println("Salary :"+salary);
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.getData();
		e.getData1();
		e.showData();
		e.showData1();

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

