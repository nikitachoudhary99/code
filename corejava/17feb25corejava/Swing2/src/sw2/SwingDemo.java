package sw2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class SwingDemo extends JPanel {
   @Override
   public void paint(Graphics g) {
	   g.drawOval(150, 150, 100, 70);
	   g.setColor(Color.gray);
	   g.fillOval(150, 150, 100, 70);
      Graphics2D graphic2d = (Graphics2D) g;
      graphic2d.setColor(Color.CYAN);
      graphic2d.fillRect(100, 50, 60, 80);
      graphic2d.drawRect(200, 200, 100, 50);
      
   }
   public static void main(String[] args) {
      JFrame frame = new JFrame("Demo");
      frame.add(new SwingDemo());
      frame.setSize(550, 250);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}