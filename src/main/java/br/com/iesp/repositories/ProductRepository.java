package br.com.iesp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.iesp.domain.Product;

/**
 * @author Cayo Hollanda
 * 
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}