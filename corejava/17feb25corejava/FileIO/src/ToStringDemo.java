class Employee
{
	private int empId;
	private String empName;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		System.out.println("Hello toString...!");
		return empId + "\t" + empName + "\t" + salary;
	}
	
}
public class ToStringDemo {

	public static void main(String[] args) {
		
		Employee e = new Employee(101, "Radhe", 20000);
		Employee e1 = new Employee();
		e1.setEmpId(102);
		e1.setEmpName("Mohan");
		e1.setSalary(30000);
		
		System.out.println(e);
		System.out.println(e1);

	}

}
