
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class MyTableDialog extends JDialog
{
	
	JTable os;
	DefaultTableModel model;
	
	
	public MyTableDialog() {
	
		super(new Frame(),"ListBox Demo");
		setSize(600,500);
		setLayout(new BorderLayout());
		
		
		
		Vector v = new Vector();
        v.addElement("S.No.");
        v.addElement("P-Id");
        v.addElement("Product-Name");
        v.addElement("Price");
        
		model = new DefaultTableModel(new Vector(),v);
		
		 os = new JTable(model);
		
		  
         
	 JPanel aPanel1=new JPanel();//new GridLayout(1,1));
     aPanel1.setBorder(BorderFactory.createTitledBorder("Product Data"));
     JScrollPane aScrollPane=new JScrollPane(os,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
     aPanel1.add(aScrollPane);
     
    
   os.setPreferredScrollableViewportSize(new Dimension(500,300));
     
    add(aPanel1,BorderLayout.CENTER);
    
    ProductDBService db = new  ProductDBService();
    ArrayList<Product>lst = db.getAllProduct();
    
    for(int i=0; i<lst.size(); i++)
    {
    	Product pd = lst.get(i);
    	Vector v1 = new Vector<>();
    	v1.addElement(i+1);
    	v1.addElement(pd.getPid());
    	v1.addElement(pd.getPname());
    	v1.addElement(pd.getPrice());
    	
    	model.addRow(v);
    }
    
	
	}
}
