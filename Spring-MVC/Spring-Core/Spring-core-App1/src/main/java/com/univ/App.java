package com.univ;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.univ.bean.Employee;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    System.out.println("hello");	
    Employee emp = new Employee(1, "ramu", 125452.22, "sihor");
    System.out.println(emp);
    }
}
