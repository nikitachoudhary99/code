package com.univ;

import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.univ.daoimpl.ProductDaoImpl;
import com.univ.pojo.Product;
import com.univ.springcfg.SpringConfig;

/**
 * Hello world!
 *
 */

public class App 
 {   

    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
      // Product pd= new Product(1005,"uytfg",2563.63);       
      ProductDaoImpl daoimpl=context.getBean(ProductDaoImpl.class);      
//        if(daoimpl.addProduct(pd))
//        {
//        	System.out.println("Student successfully Added");
//        }
//        else
//       {
//        	System.out.println("Student not Added");
//       }
//        if(daoimpl.updateStudent(pd))
//        {
//        	System.out.println("Student successfully updated");
//            product pd=new Product(1002,"ram","python");
//        }
//        else
//        {
//        	System.out.println("Student successfully not updated");
//        	
//        }
//        if(daoimpl.deleteProduct(pd))
//        {
//        	System.out.println("Product successfully deleted");
//        	
//        	
//        }
//        else
//        {
//        	System.out.println("Product successfully not deleted");
//        	
//        }
//        
        Product pd = daoimpl.searchProduct(1005);
    	if(pd!=null)
    		System.out.println(pd);
    	else
    		System.out.println("Product Not Found");
    	
    	
//    	
//        List<Product> Product = daoimpl.getAllProduct();
//
//        if (Product == null || Product.isEmpty()) {
//            System.out.println("No students found.");
//        } else {
//              for (Product product2 : Product) {
//				System.out.println(product2);
//			}
//            }
          }

    }

