package com.ronpotter99.simpleschoolwebapp.repository;

import com.ronpotter99.simpleschoolwebapp.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<Class, Long> {

    @Query("select u.teachesClass from User u where u.id = :professorId")
    List<Class> findClassesByProfessorId(@Param("professorId") Long professorId);
}
