package sw2;
import java.awt.event.*;
import  javax.swing.*;
import java.awt.*;


public class MyButtonDialog extends JDialog implements ActionListener{
	JLabel x1, x2, x3;

	JTextField t1, t2, t3;

	JButton b1, b2, b3, b4, b5,b6;
	
	public MyButtonDialog() {
	
		super(new Frame(),"Button Demo");
		setSize(200,200);
		setSize(200, 200);
		
		setLayout(new FlowLayout());
	
		x1 = new JLabel("Number1");
		x2 = new JLabel("Number2");
		x3 = new JLabel("Result ");

		t1 = new JTextField(10);
		t1.setDocument(new IntTextDocument());
		t2 = new JTextField(10);
		t2.setDocument(new IntTextDocument());
		t3 = new JTextField(10);
	
		b1 = new JButton("Add");
		b2 = new JButton("Sub");
		b3 = new JButton("Mul");
		b4 = new JButton("Div");
		b5 = new JButton("Reset");
		b6 = new JButton("Close");
		
		

		add(x1);
		add(t1);
		add(x2);
		add(t2);
		add(x3);
		add(t3);

		add(b1);
		add(b2);
		add(b3);
		add(b4);		
		add(b5);
		add(b6);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae) {
		int a, b, c;

		try {
			a = Integer.parseInt(t1.getText());
		} catch (NumberFormatException ne) {
			a = 0;
			t1.setText("0");
		}

		try {
			b = Integer.parseInt(t2.getText());
		} catch (NumberFormatException ne) {
			b = 0;
			t2.setText("0");
		}

		if (ae.getSource() == b1) {
			c = a + b;
			t3.setText(String.valueOf(c));
		}

		if (ae.getSource() == b2) {
			c = a - b;
			t3.setText(String.valueOf(c));
		}

		if (ae.getSource() == b3) {
			c = a * b;
			t3.setText(String.valueOf(c));
		}

		if (ae.getSource() == b4) {
			c = a / b;
			t3.setText(String.valueOf(c));
		}

		if (ae.getSource() == b5) {
			JFrame f =new JFrame();   
		    String name=JOptionPane.showInputDialog(f,"Enter Name");
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}

		if (ae.getSource() == b6) {
			setVisible(false);
			dispose();

		}
				
	}
	
	public static void main(String args[])
	{
		MyButtonDialog dlg = new MyButtonDialog();	
		
		dlg.setVisible(true);
		dlg.setLocation(200,200);
	}

}
