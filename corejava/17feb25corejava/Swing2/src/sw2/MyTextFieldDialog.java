package sw2;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyTextFieldDialog extends Dialog implements ActionListener{
	Label x1, x2, x3;

	TextField t1, t2, t3;

	Button b1;
	
	
	public MyTextFieldDialog() {
	
		super(new Frame(),"TextField Demo");
		setSize(200,200);
		setSize(200, 200);
		setLayout(new FlowLayout());
	
		x1 = new Label("Number1");
		x2 = new Label("Number2");
		x3 = new Label("Result ");

		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
	
		b1 = new Button("Close");
		add(x1);
		add(t1);
		add(x2);
		add(t2);
		add(x3);
		add(t3);
		add(b1);

	b1.addActionListener(this);	
		

	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == b1) {
			setVisible(false);
			dispose();

		}
		
	}

	
}
