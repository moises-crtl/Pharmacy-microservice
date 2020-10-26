package com.practicaCodigoAprendido.service;

import java.util.List;

import com.practicaCodigoAprendido.model.Product;

public interface ProductService {
	
	public List<Product> findAll();
	
	public Product created(Product product);
	
	public Product findById(Long idProduct);
	
	public Product findByName(String name);
	
	public Product update(Product product);
	
	public Product delete(Long idProduct);

}
