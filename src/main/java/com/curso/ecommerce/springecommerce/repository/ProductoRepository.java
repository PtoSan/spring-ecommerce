package com.curso.ecommerce.springecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.ecommerce.springecommerce.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
    

}
