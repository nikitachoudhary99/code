import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


 
 class ProductForm extends JFrame implements ActionListener {
	
	 JLabel l1,l2,l3;
	   JTextField t1,t2,t3;
	   JButton b1,b2,b3,b4,b5,b6,b7;
	   public ProductForm() {
		   l1= new JLabel("product-Id");
		   l2= new JLabel("product-Name");
		   l3= new JLabel("price");
		   
		   t1= new JTextField(15);
		   t2= new JTextField(15);
		   t3= new JTextField(15);
		   
		   b1=new JButton("Insert");
		   b2=new JButton("modify");
		   b3=new JButton("Delete");
		   b4=new JButton("Search");
		   b5=new JButton("reset");
		   b6=new JButton("close");
		   b7=new JButton("List of all product");
		   
		   add(l1);
		   add(t1);
		   add(l2);
		   add(t2);
		   add(l3);
		   add(t3);
		   add(b1);
		   add(b2);
		   add(b3);
		   add(b4);
		   add(b5);
		   add(b6);
		   add(b7);
		   
		   setSize(420,300);
		   setTitle("Product Form");
		   setLayout(new FlowLayout());
		 //setLayout(new FlowLayout(FlowLayout.LEFT));//center
			//setLayout(new FlowLayout(FlowLayout.RIGHT));//center
		   b1.addActionListener(this);
		   b2.addActionListener(this);
		   b3.addActionListener(this);
		   b4.addActionListener(this);
		   b5.addActionListener(this);
		   b6.addActionListener(this);
		   b7.addActionListener(this);
		   
	   }
	   
	public static void main(String[] args) {
		ProductForm clc= new ProductForm();
		clc.setVisible(true);
		clc.setLocation(300,300);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Product p=new Product();
		
		try {
			p.setPid(Integer.parseInt(t1.getText()));
	
		} 
		catch (Exception e2) {
			t1.setText("Invalid Input");
		}
		p.setPname(t2.getText());
		try {
			p.setPrice(Double.parseDouble(t3.getText()));
		} catch (Exception e2) {
			t3.setText("Invalid Input");
		}
		
		ProductDBService db=new ProductDBService();
		if(e.getSource()==b1)
		{
			if(db.addProduct(p))
			{
				t2.setText("Product added successfully");
			}
			else
			{
				t2.setText("product not added");
			}
			
			
		}
		if(e.getSource()==b2)
		{
			if(db.UpdateProduct(p))
			{
				t2.setText("Product Updated successfully");
			}
			else
			{
				t2.setText("product not update");
			}
			
			
		}
		if(e.getSource()==b3)
		{
			if(db.deleteProduct(p))
			{
				t2.setText("Product deleted successfully");
			}
			else
			{
				t2.setText("product not deleted");
			}
			
			
		}
		if(e.getSource()==b4)
		{
			Product pd=db.SearchProduct(p);
			if(pd!=null)
			{
				t1.setText(String.valueOf(pd.getPid()));
				t2.setText(pd.getPname());
				t3.setText(String.valueOf(pd.getPrice()));
			}
			else
			{
				t2.setText("product not found");
			}
		}
		if(e.getSource()==b5)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");	
		}
		if(e.getSource()==b6)
		{
			System.exit(0);
		}
		if(e.getSource()==b7)
		{
			MyTableDialog data=new MyTableDialog();
			data.setVisible(true);
			data.setLocation(200,200);
		}
		
	}
	

}
