package sw2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyCheckBoxDialog extends JDialog implements ItemListener,ActionListener{
	
	
	JCheckBox c1,c2,c3;
	JTextArea result;
	JLabel lbl;
	JButton b1;
	public MyCheckBoxDialog() {
	
		super(new Frame(),"CheckBox Demo");
		setSize(400,300);
		
		setLayout(new FlowLayout());
	
         lbl = new JLabel("Select area of interest : ");	
		c1=new JCheckBox("Software");
		c2=new JCheckBox("Hardware");
		c3=new JCheckBox("Networking");
		
		result = new JTextArea(10,50);

		b1 = new JButton("Close");
		add(lbl);
		add(c1);
		add(c2);
		add(c3);
		add(result);
		add(b1);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		b1.addActionListener(this);

		

	}

	public void itemStateChanged(ItemEvent ie) {
		
		String s = "Area of interest " ;
		s =s + "\nSoftware = " + c1.isSelected();
		s =s + "\nHardware = " + c2.isSelected();
		s =s + "\nNetworking = " + c3.isSelected();	
		
		
		result.setText(s);
					
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == b1) {
			setVisible(false);
			dispose();

		}
		
	}

	public static void main(String args[])
	{
		MyCheckBoxDialog dlg = new MyCheckBoxDialog();
		
		dlg.setVisible(true);
		dlg.setLocation(200,200);
	}

}
