package sw2;


	import javax.swing.JFileChooser;  
	import javax.swing.*;  
	import java.awt.event.*;  
	import javax.swing.filechooser.*;  
	public class JFileChoser2 
	{
	public static void main(String[] args) 
	{  
	        // creating object to the JFileChooser class  
	        JFileChooser jf = new JFileChooser("/home/administrator/My_Drive/"); // parameterised constructor JFileChooser( File currentDirectory) is called.  
	        jf.showSaveDialog(null); // opening the saved dialogue  
	    }  
	}  

