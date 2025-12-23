package sw2;
import javax.swing.JFileChooser;  
import javax.swing.filechooser.*;  
	public class JFileChooser1 
	{
	public static void main(String[] args) 
	{  
	        // creating object to the JFileChooser class  
	        JFileChooser jf = new JFileChooser(); // default constructor JFileChooser is called.  
	        jf.showSaveDialog(null);  
	        jf.showOpenDialog(null);
	 }  
	}  

