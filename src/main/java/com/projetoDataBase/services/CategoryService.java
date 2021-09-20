package com.projetoDataBase.services;

import com.projetoDataBase.entities.Category;
import com.projetoDataBase.repositories.CategoryRepository;
import com.projetoDataBase.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
    public Category findbyId(Long id) {
       Optional<Category> obj = categoryRepository.findById(id);
       return obj.get();
    }

}
