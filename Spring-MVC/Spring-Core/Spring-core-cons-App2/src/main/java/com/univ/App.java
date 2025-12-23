package com.univ;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.univ.bean.Address;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =
    			new ClassPathXmlApplicationContext("spring-cfg.xml");
    	
    	Address adr = context.getBean("adr",Address.class);
    	System.out.println(adr);
    	Address adr1 = context.getBean("adr1",Address.class);
    	System.out.println(adr1);
    	Address adr2 = context.getBean("adr2",Address.class);
    	System.out.println(adr2);
    	Address adr3 = context.getBean("adr3",Address.class);
    	System.out.println(adr3);
    }
}
