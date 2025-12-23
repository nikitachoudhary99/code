package str;
//Java Program to demonstrate the performance of StringBuffer and StringBuilder classes.
/*
No.	StringBuffer v/s StringBuilder
1)StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.	
StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
2)StringBuffer is less efficient than StringBuilder.
StringBuilder is more efficient than StringBuffer.
3)StringBuffer was introduced in Java 1.0	
StringBuilder was introduced in Java 1.5

 */
public class ConcatTest
{  
  public static void main(String[] args)
  {  
      long startTime = System.currentTimeMillis();  
      StringBuffer sb = new StringBuffer("Java");  
      for (int i=0; i<100000; i++)
      {  
          sb.append("Tpoint");  
      }  
      System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
      startTime = System.currentTimeMillis();  
      StringBuilder sb2 = new StringBuilder("Java");  
      for (int i=0; i<100000; i++)
      {  
          sb2.append("Tpoint");  
      }  
      System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
  }  
}  