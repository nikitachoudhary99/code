import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PatientInfo extends JFrame implements ActionListener {
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4,b5,b6,b7;

public PatientInfo()
{
l1=new JLabel("Patient Sno");
l2=new JLabel("Patient Name");
l3=new JLabel("Patient Disease");


t1=new JTextField(15);
t2=new JTextField(15);
t3=new JTextField(15);


b1=new JButton("Insert");
b2=new JButton("update");
b3=new JButton("Delete");
b4=new JButton("Search");
b5=new JButton("Reset");
b6=new JButton("close");
b7=new JButton("List of All patient");


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


setSize(500,500);
setTitle("patient Information");
setLayout(new FlowLayout());

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);


}

	@Override
	public void actionPerformed(ActionEvent e)
	{
	Patient pt= new Patient();
	PatientDB db=new PatientDB();
	System.out.println("33333333333333");
	try {
		pt.setSno(Integer.parseInt(t1.getText()));
	}  
	catch (Exception e2) {
	t1.setText("Invalid Input");
	}
	pt.setName(t2.getText());
	pt.setDisease(t3.getText());	
	if(e.getSource()==b7)
	{
	System.out.println("22222222222222");
		PatientTable data=new PatientTable();
		data.setVisible(true);
		data.setLocation(200, 200);
	}

	if(e.getSource()==b1)
	{
		System.out.println("Hello...");
		if(db.addPatient(pt))
		t2.setText("Patient Added");
		
		else
		t2.setText("Patient not Added");
	}
		
	if(e.getSource()==b2)
		{
		System.out.println("Hello...Update");
			if(db.updatePatient(pt))
			{
				t2.setText("Patient updated");
			}
			else
			{
				t2.setText("Patient not updated");
			}
		}
	
	if(e.getSource()==b3)
		{
			if(db.deletePatient(pt))
			{
				t2.setText("Patient deleted");
			}
			else
			{
				t2.setText("Patient not deleted");
			}
		}
	
	if(e.getSource()==b4)
		{
			pt= db.searchPatient(pt);
			
			 if(pt!=null)
			{
			t1.setText(String.valueOf(pt.getSno()));	
			t2.setText(pt.getName());
			t3.setText(pt.getDisease());
			}
			else
			{
				t2.setText("Patient not found");
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
	
		
		
	}
	public static void main(String[] args) {
		new PatientInfo().setVisible(true);


		}


}