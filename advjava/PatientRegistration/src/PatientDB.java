
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PatientDB {
	Connection con=null;

	public PatientDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/30apr25ad?user=root&password=mishthu99");
			
		} 
		catch (Exception e) {
		System.out.println("Error in loading Driver & making connection"+e.getMessage());	
		}
	}
	public boolean addPatient(Patient p)
	{
		boolean b=false;
		try {
			PreparedStatement ps=con.prepareStatement("insert into patient values(?,?,?)");
			ps.setInt(1, p.getSno());
			ps.setString(2, p.getName());
			ps.setString(3, p.getDisease());
			
			int x=ps.executeUpdate();
			if(x>0)
			{
				b=true;
			}
			else
			{
				b=false;
			}
		} 
		catch (Exception e) {
		e.printStackTrace();
		}
		return b;
	}
	public boolean deletePatient(Patient p)
	{
		boolean b=false;
		try {
			PreparedStatement ps=con.prepareStatement("delete from patient where sno=?");
			
			ps.setInt(1,p.getSno());
			int x=ps.executeUpdate();
			if(x>0)
			{
				b=true;
			}
			else
			{
				b=false;
			}
	
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return b;
	}
	public boolean updatePatient(Patient p)
	{
		boolean b=false;
		try {
			PreparedStatement ps=con.prepareStatement("update patient set name=?,disease=? where sno=?");
			ps.setString(1,p.getName());
			ps.setString(2,p.getDisease());
			ps.setInt(3,p.getSno());
			int x=ps.executeUpdate();
			if(x>0)
			{
				b=true;
			}
			else
			{
				b=false;
			}
	
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return b;
	}
	public Patient searchPatient(Patient p)
	{
		boolean b=false;
		try {
			PreparedStatement ps=con.prepareStatement("select * from patient where sno=?");
			
			ps.setInt(1,p.getSno());
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()==true)
			{
				p.setSno(rs.getInt("sno"));
				p.setName(rs.getString("name"));
				p.setDisease(rs.getString("disease"));
			}
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return p ;
	}
	public ArrayList<Patient> getAllArrayList()
	{
		System.out.println("00000000000");
		ArrayList<Patient>lst=new ArrayList<>();
		
		try {
			PreparedStatement ps=con.prepareStatement("select * from patient");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Patient p=new Patient();
				p.setSno(rs.getInt("sno"));
				p.setName(rs.getString("name"));
				p.setDisease(rs.getString("disease"));
				lst.add(p);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
	}
	
}
