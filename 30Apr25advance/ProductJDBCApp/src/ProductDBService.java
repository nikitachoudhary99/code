import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDBService {

	Connection con=null;
	public ProductDBService() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost"
			+ ":3306/30apr25ad?user=root&password=root");
		} catch (Exception e) {
			System.out.println("Error in loading drivers and making connection");
		}
	}
	
	public boolean addProduct(Product p)
	{
		boolean b=false;
		try {
			PreparedStatement ps = con.prepareStatement("insert into"
					+ " product values(?,?,?)");
			ps.setInt(1, p.getPid());
			ps.setString(2, p.getPname());
			ps.setDouble(3, p.getPrice());
			
			int x = ps.executeUpdate();
			if(x>0)
				b = true;
			else
				b = false;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return b;
	}
	public boolean deleteProduct(Product p)
	{
		boolean b=false;
		try {
			PreparedStatement 
			ps = con.prepareStatement("delete from product where pid = ?");
			
			
			ps.setInt(1, p.getPid());
			int x = ps.executeUpdate();
			if(x>0)
				b = true;
			else
				b = false;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return b;
	}
	public boolean updateProduct(Product p)
	{
		boolean b=false;
		try {
			PreparedStatement ps = 
					con.prepareStatement("update product"
					+ " set pname = ?, price = ? where pid = ?");
			
			ps.setString(1, p.getPname());
			ps.setDouble(2, p.getPrice());
			ps.setInt(3, p.getPid());
			int x = ps.executeUpdate();
			if(x>0)
				b = true;
			else
				b = false;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return b;
	}
	
	public Product searchProduct(Product p)
	{
		Product pd = new Product();
		try {
			PreparedStatement ps = 
					con.prepareStatement("select * from  product"
					+ " where pid = ?");
			
			ps.setInt(1, p.getPid());
			ResultSet rs = ps.executeQuery();
			if(rs.next()==true)
			{
				pd.setPid(rs.getInt("pid"));
				pd.setPname(rs.getString("pname"));
				pd.setPrice(rs.getDouble("price"));
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return pd;
	}

	public ArrayList<Product> getAllProduct()
	{
		ArrayList<Product>lst = new ArrayList<>();
		try {
			PreparedStatement ps = 
					con.prepareStatement("select * from  product");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Product pd = new Product();
				pd.setPid(rs.getInt("pid"));
				pd.setPname(rs.getString("pname"));
				pd.setPrice(rs.getDouble("price"));
				lst.add(pd);
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return lst;
	}

}
