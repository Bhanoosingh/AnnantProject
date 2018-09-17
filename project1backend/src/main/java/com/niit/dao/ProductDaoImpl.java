package com.niit.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import com.niit.models.Product;

import java.util.List;

import org.hibernate.Session;


@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {
	
@Autowired
private SessionFactory sessionFactory;


	public Product saveProduct(Product product) {
		try {
		Session session=sessionFactory.getCurrentSession();
		System.out.println("Id of the product before persisting " + product.getId());
		session.save(product);
		System.out.println("Id of the product after persisting " + product.getId());
		return product;
		}
		catch(Exception e) {
			e.printStackTrace();
		
		}
		return product;
		
		
		}
	
	public void updateProduct(Product product) {
		
		Session session=sessionFactory.getCurrentSession();
		session.update(product);
		
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

	
	public void deleteProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		
		Product product=(Product)session.get(Product.class, id);
		if(product!=null)
			session.delete(product);
		
	}


	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Product> getAllProducts() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Product");
		List<Product> products=query.list();
		return products;
	}
}
