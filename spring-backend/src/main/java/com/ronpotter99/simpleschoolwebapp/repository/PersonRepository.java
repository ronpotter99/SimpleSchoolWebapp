package com.ronpotter99.simpleschoolwebapp.repository;

import com.ronpotter99.simpleschoolwebapp.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("select p from Person p where p.professor = true")
    List<Person> findProfessors();
}
