package com.univ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.univ.bean.vichecal;
import com.univ.config.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
        vichecal vic=(vichecal)context.getBean(vichecal.class);
        vic.getBike().setbNo(2036);
        vic.getBike().setPrice(2500000);
        vic.getCar().setcNo(4569);
        vic.getCar().setCompany("yamaha");
        System.out.println(vic);
    }
}
