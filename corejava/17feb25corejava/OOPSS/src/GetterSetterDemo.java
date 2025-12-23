class Student
{
	private int roll;
	private String name;
	private double marks;
	public Student() {
		
	}
	public Student(int roll) {
		
		this.roll = roll;
	}
	public Student(int roll, String name) {
		
		this.roll = roll;
		this.name = name;
	}
	public Student(int roll, String name, double marks) {
		
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
}
public class GetterSetterDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student(101, "Raju Rastogi", 55);
		s1.setRoll(102);
		s1.setName("Shyam Bihari");
		s1.setMarks(76);
		
		System.out.println("Rollno = "+s2.getRoll());
		System.out.println("Name = "+s2.getName());
		System.out.println("Marks = "+s2.getMarks());
		System.out.println("Rollno = "+s1.getRoll());
		System.out.println("Name = "+s1.getName());
		System.out.println("Marks = "+s1.getMarks());

	}
}
