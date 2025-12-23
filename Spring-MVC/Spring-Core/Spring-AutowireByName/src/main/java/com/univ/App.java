package com.univ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.univ.bean.Container;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.cfg.xml");
        
        Container cnt=(Container)context.getBean("cnt");
        System.out.println(cnt);
    }
}
