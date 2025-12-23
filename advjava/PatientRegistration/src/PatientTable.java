
	import java.awt.*;
	import java.awt.event.*;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Vector;

	import javax.swing.*;
	import javax.swing.table.DefaultTableModel;


	public class PatientTable extends JDialog
	{
		
		JTable os;
		DefaultTableModel model;
		
		
		public PatientTable() {
		
			super(new Frame(),"Patient list",true);
			setSize(600,500);
			setLayout(new BorderLayout());
			
			
			
			Vector v = new Vector();
	        v.addElement("S.No.");
	        v.addElement("Patient sno");
	        v.addElement("Product-Name");
	        v.addElement("Disease");
	        
			model = new DefaultTableModel(new Vector(),v);
			
			 os = new JTable(model);
			
			  
	         
		 JPanel aPanel1=new JPanel();//new GridLayout(1,1));
	     aPanel1.setBorder(BorderFactory.createTitledBorder("Patient Data"));
	     JScrollPane aScrollPane=new JScrollPane(os,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    
	     
	    
	   os.setPreferredScrollableViewportSize(new Dimension(500,300));
	     aPanel1.add(aScrollPane);
	    add(aPanel1,BorderLayout.CENTER);
	    
	    
	    System.out.println("111111111111");
	    
	    PatientDB db = new  PatientDB();
	    
	    ArrayList<Patient>lst = db.getAllArrayList();
	    //System.out.println(lst);
	    for(int i=0; i<lst.size(); i++)
	    {
	    	Patient pd = lst.get(i);
	    	System.out.println(pd);
	    	Vector v1 = new Vector<>();
	    	v1.addElement(i+1);
	    	v1.addElement(pd.getSno());
	    	v1.addElement(pd.getName());
	    	v1.addElement(pd.getDisease());
	    	
	    	model.addRow(v1);
	    }
	    
		
		}
		 
	}

