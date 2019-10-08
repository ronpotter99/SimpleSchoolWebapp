package com.ronpotter99.simpleschoolwebapp.repository;

import com.ronpotter99.simpleschoolwebapp.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Class, Long> {
}
