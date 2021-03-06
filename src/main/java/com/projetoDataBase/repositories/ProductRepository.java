package com.projetoDataBase.repositories;

import com.projetoDataBase.entities.Product;
import com.projetoDataBase.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
