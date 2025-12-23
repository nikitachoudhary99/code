// Java Program to add all predefined cursors to a choice

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class cursor1 extends JFrame implements ItemListener 
{
	// frame
	static JFrame f;

	// labels
	static Label l;

	// create a choice
	static Choice c;

	// default constructor
	cursor1()
	{
	}

	// main class
	public static void main(String args[])
	{
		
		// create a frame
		f = new JFrame("cursor");

		// create e panel
		JPanel p = new JPanel();

		// create a choice
		c = new Choice();

		// add items to choice
		for (int i = 0; i < 14; i++)
			c.add(Cursor.getPredefinedCursor(i).getName());

		// object of class
		cursor1 cu = new cursor1();

		// create a label
		l = new Label(" label one ");

		// add item listener to the choice
		c.addItemListener(cu);

		// add labels to panel
		p.add(l);
		p.add(c);

		// add panel to the frame
		f.add(p);

		// show the frame
		f.show();
		f.setSize(250, 300);
	}

	// if an item of choice is selected
	public void itemStateChanged(ItemEvent e)
	{
		
		// set the cursor
		l.setCursor(Cursor.getPredefinedCursor(c.getSelectedIndex()));
	}
}
