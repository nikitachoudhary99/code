package com.univ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.univ.bean.Bag;
import com.univ.bean.DBConnection;
import com.univ.bean.Interviews;
import com.univ.bean.Product;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context = 
    			new ClassPathXmlApplicationContext("spring.cfg.xml");
    	
    	Bag bag = context.getBean("balls",Bag.class);
    	System.out.println(bag);
    	
    	Product pd = context.getBean("pdr",Product.class);
    	System.out.println(pd);
    	
    	Interviews itr = context.getBean("schedul",Interviews.class);
    	System.out.println(itr);
    	
    	DBConnection db = context.getBean("dbprop",DBConnection.class);
    	System.out.println(db);
    	
    }
}