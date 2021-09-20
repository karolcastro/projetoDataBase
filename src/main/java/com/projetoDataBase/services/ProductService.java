package com.projetoDataBase.services;

import com.projetoDataBase.entities.Product;
import com.projetoDataBase.entities.User;
import com.projetoDataBase.repositories.ProductRepository;
import com.projetoDataBase.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {

        return productRepository.findAll();
    }
    public Product findbyId(Long id) {
       Optional<Product> obj = productRepository.findById(id);
       return obj.get();
    }

}
