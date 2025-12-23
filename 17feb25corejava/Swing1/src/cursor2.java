package collect;
//Java program to create a custom cursor and add it to labels
import java.awt.*;
import javax.swing.*;
class cursor2 extends JFrame {
	// frame
	static JFrame f;

	// label
	static Label l, l1, l2;

	// default constructor
	cursor2()
	{
		// create a frame
		f = new JFrame("cursor");

		// create e panel
		JPanel p = new JPanel();

		// extract image
		// the files gfg.jpg and gfg.png contains image of cursor
		Image i = Toolkit.getDefaultToolkit().getImage("COPY.GIF");
		Image i1 = Toolkit.getDefaultToolkit().getImage("New.gif");

		// point p
		Point p11 = new Point(0, 0);

		// create labels
		l = new Label("label one");
		l1 = new Label("label two");

		// create cursors
		Cursor c = Toolkit.getDefaultToolkit().createCustomCursor(i, p11, "cursor1");
		Cursor c1 = Toolkit.getDefaultToolkit().createCustomCursor(i1, p11, "cursor2");

		// set cursor
		l.setCursor(c);
		l1.setCursor(c1);

		// add labels to panel
		p.add(l);
		p.add(l1);

		// add panel to the frame
		f.add(p);

		// show the frame
		f.show();
		f.setSize(250, 300);
	}

	// main class
	public static void main(String args[])
	{
		cursor2 c = new cursor2();
	}
}

