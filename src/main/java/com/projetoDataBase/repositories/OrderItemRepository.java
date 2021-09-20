package com.projetoDataBase.repositories;

import com.projetoDataBase.entities.OrderItem;
import com.projetoDataBase.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
