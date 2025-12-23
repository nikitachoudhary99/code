package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {

	@Id
	private int empId;
	private String empName;
	private double salary;
	@OneToMany
	@JoinColumn(name = "empId")
	private Set<Department>depts = new HashSet<>();
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
	
	public Set<Department> getDepts() {
		return depts;
	}
	public void setDepts(Set<Department> depts) {
		this.depts = depts;
	}
	@Override
	public String toString() {
		return empId + "\t" + empName + "\t" + salary ;
	}
	
}
