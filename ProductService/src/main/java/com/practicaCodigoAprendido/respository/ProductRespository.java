package com.practicaCodigoAprendido.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practicaCodigoAprendido.model.Product;

public interface ProductRespository extends JpaRepository<Product, Long>{

	public Product findByName(String name);
}


