package com.projetoDataBase.repositories;

import com.projetoDataBase.entities.Category;
import com.projetoDataBase.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
