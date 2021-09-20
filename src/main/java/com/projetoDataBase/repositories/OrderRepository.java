package com.projetoDataBase.repositories;

import com.projetoDataBase.entities.Order;
import com.projetoDataBase.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
