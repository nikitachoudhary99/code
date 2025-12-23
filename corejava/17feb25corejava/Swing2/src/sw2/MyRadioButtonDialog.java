package sw2;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyRadioButtonDialog extends JDialog implements ItemListener,ActionListener{
	
	
	JRadioButton c1,c2,c3;
	ButtonGroup cbg;
	JTextArea result;
	JLabel lbl;
	JButton b1;
	public MyRadioButtonDialog() {
	
		super(new Frame(),"RadioButton Demo");
		setSize(400,300);
		
		setLayout(new FlowLayout());
	
		 cbg= new ButtonGroup();
         lbl = new JLabel("Select area of interest : ");	
		c1=new JRadioButton("Software",true);
		c2=new JRadioButton("Hardware",true);
		c3=new JRadioButton("Networking",true);
		cbg.add(c1);	
		cbg.add(c2);
		cbg.add(c3);

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
		MyRadioButtonDialog dlg = new MyRadioButtonDialog();
		
		dlg.setVisible(true);
		dlg.setLocation(200,200);
	}

}
