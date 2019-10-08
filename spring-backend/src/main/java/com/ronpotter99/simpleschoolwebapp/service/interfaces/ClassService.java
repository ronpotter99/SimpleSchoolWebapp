package com.ronpotter99.simpleschoolwebapp.service.interfaces;

import com.ronpotter99.simpleschoolwebapp.entity.Class;

import java.util.List;

public interface ClassService {

    List<Class> getAllClasses();

    List<Class> getClassesForProfessor(Long professorId);

    Class getClass(Long classId);
}
