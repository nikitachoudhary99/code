package sw2;
import java.awt.event.*;
import  javax.swing.*;
import java.awt.*;


public class MyJMenuBarDemo extends JDialog implements ActionListener{
	JLabel x1, x2, x3;

	JTextField t1, t2, t3;

	JMenuBar mbar;
	JMenu m1,m2;
	JMenuItem b1, b2, b3, b4, b5,b6;
	
	public MyJMenuBarDemo() {
	
		super(new JFrame(),"Button Demo");
		setSize(200,200);
		setSize(200, 200);
		
		setLayout(new FlowLayout());
	
		mbar = new JMenuBar();
		setJMenuBar(mbar);
		
		m1 = new JMenu("Operations");
		m2 = new JMenu("Options");
		
		mbar.add(m1);
		mbar.add(m2);
		
		b1 = new JMenuItem("Add");
		b2 = new JMenuItem("Sub");
		b3 = new JMenuItem("Multi");
		b4 = new JMenuItem("Div");
		
		m1.add(b1);
		m1.add(b2);
		m1.addSeparator();
		m1.add(b3);
		m1.add(b4);
		
		b5 = new JMenuItem("Reset");
		b6 = new JMenuItem("Exit");
		m2.add(b5);
		m2.add(b6);
		x1 = new JLabel("Number1");
		x2 = new JLabel("Number2");
		x3 = new JLabel("Result ");

		t1 = new JTextField(10);
		t1.setDocument(new IntTextDocument());
		t2 = new JTextField(10);
		t2.setDocument(new IntTextDocument());
		t3 = new JTextField(10);
	
		add(x1);
		add(t1);
		add(x2);
		add(t2);
		add(x3);
		add(t3);

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
//			JFrame f =new JFrame();   
//		    String name=JOptionPane.showInputDialog(f,"Enter Name");
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
		MyJMenuBarDemo dlg = new MyJMenuBarDemo();	
		
		dlg.setVisible(true);
		dlg.setLocation(200,200);
	}

}


