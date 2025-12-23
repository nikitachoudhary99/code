package sw2;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends JFrame implements ActionListener 
{

	JRadioButton c1,c2,c3;
	ButtonGroup cbg;
	JMenuBar mbar;
    JToolBar toolbar; 
	JMenu m1, m2,m3;
	JMenuItem item1, item2, item3, item4, item5, item6,item7,item8;
	JRadioButtonMenuItem item9, item10,item11,item12;
	JButton  b1,b2,b3,b4,b5,b6,b7;

	MyFrame4() 
	{ 
		setTitle("SwingDemo2");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
		
		setLayout(new BorderLayout());
		
		Image icon = Toolkit.getDefaultToolkit().getImage("Save.gif");    
		this.setIconImage(icon);    
		//setIconImage(new ImageIcon("new.gif"));//(new ImageIcon("new.gif"));
            createmenubar();
            createtoolbar();
           add(toolbar,BorderLayout.NORTH);
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);
		item5.addActionListener(this);
		item6.addActionListener(this);
		item7.addActionListener(this);
		item8.addActionListener(this);
		item9.addActionListener(this);
		item10.addActionListener(this);
		item11.addActionListener(this);
		item12.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
	}
	public void createmenubar()
	{
		mbar = new JMenuBar();
		setJMenuBar(mbar);
		m1 = new JMenu("Basic-Swing");
		//m1.setMnemonic(KeyEvent.VK_B);
		item1 = new JMenuItem("Label Demo",new ImageIcon("New.gif"));
		item1.setMnemonic(KeyEvent.VK_L);
		item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK ));
		item2 = new JMenuItem("TextBox Demo ");
		item2.setMnemonic(KeyEvent.VK_T);
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.ALT_MASK ));
	
		item3 = new JMenuItem("Button Demo");		
		item3.setMnemonic(KeyEvent.VK_B);
		item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.ALT_MASK ));//+ActionEvent.ALT_MASK  ));
		
		item4 = new JMenuItem("Checkbox Demo",new ImageIcon("PrintPreview.gif"));
		item5 = new JMenuItem("RadioButton Demo");

		m1.add(item1);
		m1.add(item2);
		m1.addSeparator();
		m1.add(item3);
		m1.add(item4);
		m1.add(item5);

		mbar.add(m1);

		m2 = new JMenu("Advance-Swing");
		
		item6 = new JMenuItem("ComboBox Demo");
		item6.setMnemonic(KeyEvent.VK_C);
		item6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK +ActionEvent.ALT_MASK  ));
		item7 = new JMenuItem("ListBox Demo");
		item8 = new JMenuItem("Table Demo");
		m2.add(item6);		
		m2.add(item7);
		m2.add(item8);
		mbar.add(m2);
		
		//
		
m3 = new JMenu("Look & Feel");
		ButtonGroup bg = new ButtonGroup();
		
		item9 = new JRadioButtonMenuItem("Native  look and feel");
		bg.add(item9);
		
		item10 = new JRadioButtonMenuItem("Java look and feel");
		bg.add(item10);
		
		item11 = new JRadioButtonMenuItem("Motif look and feel");
		bg.add(item11);
		item12 = new JRadioButtonMenuItem("My look and feel");
		bg.add(item12);
		
		m3.add(item9);
		m3.add(item10);
		m3.add(item11);
		m3.add(item12);
		mbar.add(m3);
		
	}
	public void createtoolbar()
	{
		toolbar = new JToolBar();
		toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));
		toolbar.setBorder(BorderFactory.createEtchedBorder());

		b1 = new JButton("Label Demo",new ImageIcon("New.gif"));
		
		b1.setBorderPainted(true);


		b1.setToolTipText("Demo of Labels");
		b1.setFocusPainted(true);
		
		b2 = new JButton("TextBox Demo ");
		b2.setToolTipText("Demo of Textbox");
		b3 = new JButton("Button Demo");
		b3.setToolTipText("Demo of Buttons");
		b4 = new JButton(new ImageIcon("Save.gif"));
		
		b5 = new JButton("RadioButton Demo");		
		
		b6 = new JButton("ComboBox Demo");
		b7 = new JButton("ListBox Demo",new ImageIcon("Print.gif"));
		cbg = new ButtonGroup();
		c1=new JRadioButton("Software",true);
		c2=new JRadioButton("Hardware",true);
		c3=new JRadioButton("Networking",true);
		cbg.add(c1);	
		cbg.add(c2);
		cbg.add(c3);
		
		toolbar.add(b1);
		
		toolbar.add(b2);
		
		toolbar.add(b3);		
		toolbar.add(b4);
		toolbar.add(b5);
		toolbar.add(b6);

		toolbar.add(b7);
		toolbar.add(c1);
		toolbar.add(c2);
		toolbar.add(c3);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		if (ae.getSource() == item1 || ae.getSource() == b1) {
			testLabel();
		}
		if (ae.getSource() == item2 || ae.getSource() == b2) {
			testTextbox();
		}
		if (ae.getSource() == item3 || ae.getSource() == b3) {
			testButton();
		}
		if (ae.getSource() == item4 || ae.getSource() == b4) {
			testCheckbox();
		}
		if (ae.getSource() == item5 || ae.getSource() == b5) {
			testRadioButton();
		}
		if (ae.getSource() == item6 || ae.getSource() == b6) {
			testCombobox();
		}
		if (ae.getSource() == item7 || ae.getSource() == b7) {
			testListBox();
		}
		if (ae.getSource() == item8) {
			testTable();
		}
		if (ae.getSource() == item9) {
			try{
				 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
			}
			catch(Exception e){
			}
		}
		if (ae.getSource() == item10) {
			try{
				 UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
				 
			 SwingUtilities.updateComponentTreeUI(this);
			}
			catch(Exception e){
			}
		}
		if (ae.getSource() == item11) {
			try{
				 UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			 SwingUtilities.updateComponentTreeUI(this);
			}
			catch(Exception e){
			}
			if (ae.getSource() == item12) {
				try{
					 UIManager.setLookAndFeel("joxy.JoxyArrowButton");
				 SwingUtilities.updateComponentTreeUI(this);
				}
				catch(Exception e){	
				}
		}	
	}
}
//com.sun.java.swing.plaf.gtk.GTKLookAndFeel
//com.sun.java.swing.plaf.motif.MotifLookAndFeel
//com.sun.java.swing.plaf.windows.WindowsLookAndFeel
	public  void testLabel(){
		MyLabelDialog dlg = new MyLabelDialog();
		dlg.setVisible(true);
		dlg.setLocation(200,200);	
	}
	public  void testTextbox(){
		MyTextFieldDialog dlg = new MyTextFieldDialog();
		dlg.setVisible(true);
		dlg.setLocation(200,200);
	}
	public  void testButton(){
		MyButtonDialog dlg = new MyButtonDialog();
		dlg.setVisible(true);
		dlg.setLocation(200,200);	
	}
	public  void testCheckbox(){
		MyCheckBoxDialog dlg = new MyCheckBoxDialog();
		dlg.setVisible(true);
		dlg.setLocation(200,200);	
	}
	public  void testRadioButton(){
		MyRadioButtonDialog dlg = new MyRadioButtonDialog();
		dlg.setVisible(true);
		dlg.setLocation(200,200);	
	}
	public  void testCombobox(){
		MyComboBoxDialog dlg = new MyComboBoxDialog();
		dlg.setVisible(true);
		dlg.setLocation(200,200);	
	}
	public  void testListBox(){
		MyListBoxDialog dlg = new MyListBoxDialog();
		dlg.setVisible(true);
		dlg.setLocation(200,200);		
	}
	public  void testTable(){
		MyTableDialog dlg = new MyTableDialog();
		dlg.setVisible(true);
		dlg.setLocation(200,200);
	}
}

class MyWindowAdapter extends WindowAdapter
{
	MyFrame4 mf1;
	public MyWindowAdapter(MyFrame4 mf) 
	{
		mf1 = mf;
	}
	public void windowClosing(WindowEvent we)
	{
		int a=JOptionPane.showConfirmDialog(mf1,"Are you sure?");  
		if(a==JOptionPane.YES_OPTION)
		{  
		    mf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//System.exit(0);
		}
	}
}
public class SwingMenuDemo 
{
	public static void main(String args[]) 
	{
		MyFrame4 mf = new MyFrame4();
		mf.addWindowListener(new MyWindowAdapter(mf));
		mf.setVisible(true);
	}
}
