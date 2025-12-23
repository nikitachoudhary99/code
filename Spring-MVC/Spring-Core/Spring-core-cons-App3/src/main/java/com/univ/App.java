package com.univ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.univ.bean.Password;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("spring-cfg.xml");
        Password pas=new Password();
        System.out.println(pas);
        Password pas1=new Password(111,"eama","$%^");
        System.out.println(pas1);
        Password pas2=new Password("era","*&^");
        System.out.println(pas2);
        Password pas3=new Password("$");
        System.out.println(pas3);
        
    }
}
