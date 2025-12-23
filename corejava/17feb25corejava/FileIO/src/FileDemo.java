package file;
import java.io.File;
import java.util.Date;
class FileDemo
{
static void p(String s)
{
 System.out.println(s);
}

 public static void main(String args[])
{
 File f1 = new File("/home/administrator/My_Drive/4to5batch04.07.2023java/FileIO/stud.doc");
 p("file name:"+f1.getName());
 p("path: "+ f1.getPath());
 p("abs path: "+ f1.getAbsolutePath());
p(" parent : "+ f1.getParent());
p(f1.exists() ? "exists" :"does not exist");
p(f1.canWrite() ? "is writable":"is not writable");
p(f1.canRead()  ? "is readable" :"is not readable");
p("is " + (f1.isDirectory() ? " " : "not" ) +" a directory");
p(f1.isFile() ? "is normal file":" might be named pipe");
p(f1.isAbsolute() ? "is absolute" : "is not absolute");
p("file last modified:"+f1.lastModified());
Date d =new Date(f1.lastModified());
System.out.println(d);
p("file size " + f1.length()  +"Bytes"); 
}
}