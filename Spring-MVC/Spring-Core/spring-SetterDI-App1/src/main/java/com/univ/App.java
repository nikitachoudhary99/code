package com.univ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.univ.bean.Address;
import com.univ.bean.Employee;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");

        Address adr = (Address) context.getBean("adr");
        Employee emp=(Employee) context.getBean("emp");
        System.out.println(emp);
        System.out.println(adr);
       
    }
}
