package sw2;
import javax.swing.*;  
public class OptionPaneExample2 
{  
JFrame f;  
OptionPaneExample2()
{  
    f=new JFrame();   
    String name=JOptionPane.showInputDialog(f,"Enter Name:");
    System.out.println("Your Entered : "+name);
}  
public static void main(String[] args) 
{  
    new OptionPaneExample2();  
}  
}  
