package com.niit.project1backend;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.DBConfiguration;
import com.niit.dao.ProductDao;
import com.niit.dao.ProductDaoImpl;
import com.niit.models.Product;

/**
 * Hello world!
 *
 */
public class App 
{
   
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       
		ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,ProductDaoImpl.class);
        ProductDao productDao=(ProductDaoImpl)context.getBean("productDaoImpl");
        
        Product product=new Product();
        product.setProductname("pen");
        product.setProductdesc("Description about pen");
        product.setPrice(100);
        product.setQuantity(10);
         
        productDao.saveProduct(product);
        
    }
}