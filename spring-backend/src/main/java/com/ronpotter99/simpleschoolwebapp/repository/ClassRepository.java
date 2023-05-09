package com.ronpotter99.simpleschoolwebapp.repository;

import com.ronpotter99.simpleschoolwebapp.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClassRepository extends JpaRepository<Class, Long> {

    @Query("select c from Class c where c.professor.id = :professorId")
    List<Class> findClassesByProfessorId(@Param("professorId") Long professorId);

    @Query("select c from Class c inner join c.enrolledStudents es where es.id = :studentId")
    List<Class> findClassesByStudentId(@Param("studentId") Long studentId);
}
