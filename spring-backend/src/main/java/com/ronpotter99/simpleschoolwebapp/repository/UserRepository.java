package com.ronpotter99.simpleschoolwebapp.repository;

import com.ronpotter99.simpleschoolwebapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
