import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Employee{
	private int sal;
	private int empid;
	private String name;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int sal, int empid, String name) {
		super();
		this.sal = sal;
		this.empid = empid;
		this.name = name;
	}

	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return sal+"\t"+empid+"\t"+name+"\n";
	}
	
	
}
class employeeid implements Comparator{
	public int compare(Object obj1, Object obj2) {
		
		Employee s1 = (Employee)obj1;
		Employee s2 = (Employee)obj2;
		
		int diff =(int)(s2.getSal()-s1.getSal());
		if(diff==0)
		{
			diff = s1.getName().compareTo(s2.getName());
			if(diff==0)
				diff = s1.getEmpid()-s2.getEmpid();
		}
		
		return diff;
	}
}

public class TreeSetDemolab {

	public static void main(String[] args) {
		employeeid id=new employeeid();
		TreeSet<Employee>ts = new TreeSet(id);
		
		ts.add(new Employee(2000,101,"nikita"));
		ts.add(new Employee(2000,102,"nikita"));
		ts.add(new Employee(2000,104,"nikita"));
		ts.add(new Employee(2000,100,"nikita"));
		
		System.out.println(ts);
	}

}
