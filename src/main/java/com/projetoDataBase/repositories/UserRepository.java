package com.projetoDataBase.repositories;

import com.projetoDataBase.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
