package com.univ;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.univ.bean.Container;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-cfg.xml");
    	
    	Container cnt = (Container)context.getBean("cnt");
    	System.out.println("Hellooooo");
    	System.out.println(cnt);
    	
    }
}
