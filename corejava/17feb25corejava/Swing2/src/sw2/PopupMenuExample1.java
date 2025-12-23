package sw2;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;  
class PopupMenuExample1  implements ActionListener
{  
	JMenuItem copy;
	JLabel label;
	
     PopupMenuExample1()
     {  
         JFrame f= new JFrame("PopupMenu Example");  
         label = new JLabel("jhjhjhjhjhjhjhj");
         f.add(label);
         f.setLayout(new FlowLayout());
         f.add(label);    
         f.setSize(400,400);  
         //f.setLayout(new FlowLayout());  
         f.setVisible(true);
         //label.setHorizontalAlignment(JLabel.CENTER);  
         //label.setSize(400,100);  
         final JPopupMenu popupmenu = new JPopupMenu("Edit");   
         JMenuItem cut = new JMenuItem("Cut");  
         copy = new JMenuItem("Copy");  
         JMenuItem paste = new JMenuItem("Paste");  
         popupmenu.add(cut);
         popupmenu.add(copy);
         popupmenu.add(paste);
         f.add(popupmenu);
         f.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                popupmenu.show(f , e.getX(), e.getY());  
            }                 
         });  
        /*cut.addActionListener(new ActionListener(){  
         public void actionPerformed(ActionEvent e) {              
             label.setText("cut MenuItem clicked.");  
         }  
        });  
          */
              
           
        copy.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e) {              
                label.setText("copy MenuItem clicked.");  
            }  
           });  
        paste.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e) {              
                label.setText("paste MenuItem clicked.");  
            }  
           });  
           
     }  
     public void actionPerformed(ActionEvent e) 
     { 
     	if(e.getSource()==copy)
         label.setText("copy MenuItem clicked.");  
     }
public static void main(String args[])  
{  
        new PopupMenuExample();  
}  
}  