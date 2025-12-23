




import java.util.Comparator;
import java.util.TreeSet;

class Student
{
	private int roll;
	private String name;
	private double per;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, double per) {
		super();
		this.roll = roll;
		this.name = name;
		this.per = per;
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
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return roll + "\t" + name + "\t" + per + "\n";
	}
	
}
class StudentCmp implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
		
		Student s1 = (Student)obj1;
		Student s2 = (Student)obj2;
		
		int diff =(int)(s2.getPer()-s1.getPer());
		if(diff==0)
		{
			diff = s1.getName().compareTo(s2.getName());
			if(diff==0)
				diff = s1.getRoll()-s2.getRoll();
		}
		
		return diff;
	}
	
}
public class StudentComparatorDemo {

	public static void main(String[] args) {
		
		StudentCmp cmp = new StudentCmp();
		TreeSet<Student>ts = new TreeSet<>(cmp);
		
		
		ts.add(new Student(102, "Geeta", 75));
		ts.add(new Student(101, "Geeta", 75));
		ts.add(new Student(103, "Shyam", 85));
		ts.add(new Student(104, "Mohan", 65));
		ts.add(new Student(105, "Ankit", 85));
		ts.add(new Student(106, "Kanak", 50));

		System.out.println(ts);
	}

}