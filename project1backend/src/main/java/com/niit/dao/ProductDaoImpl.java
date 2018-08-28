package com.niit.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import com.niit.models.Product;
import org.hibernate.Session;


@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {
	
@Autowired
private SessionFactory sessionFactory;


	public boolean saveProduct(Product product) {
		try {
		Session session=sessionFactory.getCurrentSession();
		System.out.println("Id of the product before persisting " + product.getId());
		session.save(product);
		System.out.println("Id of the product after persisting " + product.getId());
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
		}
	
	
	public Product getProduct(int id) {
		try {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class, id);
		
		return product;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
