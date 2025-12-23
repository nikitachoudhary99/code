package sw2;

import java.io.*;
import java.util.Date;

import javax.swing.*;  
	import java.awt.event.*;  
	import javax.swing.filechooser.*;  
	public class JFileChooser3 
	{  
	public static void main(String[] args) 
	{  
		try
		{
	        // creating object to the JFileChooser class  
	        JFileChooser jf = new JFileChooser("/home/administrator/My_Drive/17.feb25corejava");   
	        //jf.showSaveDialog(null); // opening the saved dialogue
	        jf.showOpenDialog(jf);
	        File f =  jf.getSelectedFile();
	        //FileInputStream ft = new FileInputStream(jf.getfile)
	        String s = f.getPath().toString();
	        
	        FileInputStream fis = new FileInputStream(s);
	        int len = fis.available();
	        jf.showSaveDialog(jf);
	        
	        File f2 = jf.getSelectedFile();
	        System.out.println(f2.getName());
	        FileOutputStream fos = new FileOutputStream(f.getParent()+"/"+f2.getName());
	        byte bt[] = new byte[len];
	        fis.read(bt); 
	        fos.write(bt);
	        
	      /*  System.out.println("File : "+f.getName());
	        System.out.println("File : "+f.getPath());
	        System.out.println("File : "+new Date(f.lastModified()));
	        //jf.showSaveDialog(jf);
	        */
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	    }  
	}  


