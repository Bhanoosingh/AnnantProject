package com.niit.dao;

import com.niit.models.Product;

public interface ProductDao {
boolean saveProduct(Product product);

Product getProduct(int id);
}
