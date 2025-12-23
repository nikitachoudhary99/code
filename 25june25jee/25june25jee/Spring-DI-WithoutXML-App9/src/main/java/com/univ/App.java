package com.univ;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.univ.bean.Container;
import com.univ.config.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context = 
    		new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	Container cnt = (Container)context.getBean(Container.class);
    	cnt.getAbc().setX(100);
    	cnt.getXyz().setY(200);
    	System.out.println(cnt);
    	
    }
}
