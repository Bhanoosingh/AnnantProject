package com.niit.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.models.Product;

@SuppressWarnings("unused")
public class ProductDAOImplTest {
	
	private static AnnotationConfigApplicationContext context=null;
	private static ProductDao productDao;
	private Product product=null;
	
	@BeforeClass
	public static void setupBeforeClass()throws Exception{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		productDao=(ProductDao)context.getBean("productDao");
	}

	@Test
	public void testSaveProduct() {
		product=new Product();
		
		product.setProductname("Television");
		product.setProductdesc("Sony OLED TV");
		product.setPrice(56499);
		product.setQuantity(22);
		assertTrue("Fail to insert", productDao.saveProduct(product));
	}

	private void assertTrue(String message, Product saveProduct) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testGetProduct() {
		product=productDao.getProduct(1);
		assertNotNull("Null object returend",product);
	}

}
