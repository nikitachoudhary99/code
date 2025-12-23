package sw1;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageDisplay extends JFrame 
{

	JLabel lbl;
	public ImageDisplay()
	{
		ImageIcon i = new ImageIcon("india.jpg");
		lbl = new JLabel(new ImageIcon());
		setSize(1200, 700);
		setLayout(new FlowLayout());
		lbl.setIcon(i);
		add(lbl);
	}
	public static void main(String args[])
	{
		ImageDisplay img = new ImageDisplay();
		img.setVisible(true);
	}

}
