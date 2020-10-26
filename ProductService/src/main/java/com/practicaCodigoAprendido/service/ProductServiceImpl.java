package com.practicaCodigoAprendido.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicaCodigoAprendido.model.Product;
import com.practicaCodigoAprendido.respository.ProductRespository;

@Service(value = "productService")
public class ProductServiceImpl implements ProductService {

	
	private ProductRespository productRepository;
	
	
	@Autowired
	public ProductServiceImpl(ProductRespository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product created(Product product) {
		product.setStatus("CREATED");
		product.setDate(new Date());
		return productRepository.save(product);
	}

	@Override
	public Product findById(Long idProduct) {
		return productRepository.findById(idProduct).orElse(null);
	}

	@Override
	public Product findByName(String name) {
		return productRepository.findByName(name);
	}

	@Override
	public Product update(Product product) {
		Product updateProduct = productRepository.findById(product.getIdProduct()).orElse(null);
		if (updateProduct == null) {
			return null;
		}else {
			updateProduct.setName(product.getName());
			updateProduct.setPrice(product.getPrice());
			updateProduct.setDate(product.getDate());
			return productRepository.save(updateProduct);
		}
	}

	@Override
	public Product delete(Long idProduct) {
		Product deleteProduct = productRepository.findById(idProduct).orElse(null);
		if (deleteProduct == null) {
			return null;
		}else {
			deleteProduct.setStatus("DELETE");
			return productRepository.save(deleteProduct);
		}
	}

}
