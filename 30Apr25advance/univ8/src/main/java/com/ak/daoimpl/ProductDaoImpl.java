package com.ak.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ak.dao.ProductDao;
import com.ak.pojo.Product;

public class ProductDaoImpl implements ProductDao{

	Connection con = null;
	public ProductDaoImpl() {
		try 
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
			+ "30apr25ad?user=root&password=root");
		}
		catch (Exception e) 
		{
			System.out.println("Error in loading drivers and making connection");
		}
	}
	@Override
	public boolean addProduct(Product p) {

	try {
		PreparedStatement ps = con.prepareStatement("insert into "
				+ "product values(?,?,?)");
		ps.setInt(1, p.getpId());
		ps.setString(2, p.getpName());
		ps.setDouble(3, p.getPrice());
		
		int count = ps.executeUpdate();
		if(count>0)
			return true;
		else
			return false;
	} catch (SQLException e) {
		e.printStackTrace();
		return false;
	}
	}
	@Override
	public boolean updateProduct(Product p) {
		try {
			PreparedStatement ps = con.prepareStatement("update product "
					+ "set pname = ?,price = ? where pid = ?");
			
			ps.setString(1, p.getpName());
			ps.setDouble(2, p.getPrice());
			ps.setInt(3, p.getpId());
			int count = ps.executeUpdate();
			if(count>0)
				return true;
			else
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}
	@Override
	public boolean deleteProduct(Product p) {
		try {
			PreparedStatement ps = con.prepareStatement("delete from product "
					+ "where pid = ?");
			
			ps.setInt(1, p.getpId());
			int count = ps.executeUpdate();
			if(count>0)
				return true;
			else
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public Product searchProduct(int pid) {
		Product pd = new Product();
		try {
			PreparedStatement ps = con.prepareStatement("select * from product "
					+ "where pid = ?");
			
			ps.setInt(1, pid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()==true)
			{
				pd.setpId(rs.getInt("pid"));
				pd.setpName(rs.getString("pname"));
				pd.setPrice(rs.getDouble("price"));
				return pd;
				
			}
			else
				return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	@Override
	public List<Product> getAllProducts() {
		List<Product>lst = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement("select * from product");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Product p = new Product();
				p.setpId(rs.getInt("pid"));
				p.setpName(rs.getString("pname"));
				p.setPrice(rs.getDouble("price"));
				lst.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
	}
	

	
}
