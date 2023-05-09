package com.ronpotter99.simpleschoolwebapp.service.interfaces;

import com.ronpotter99.simpleschoolwebapp.entity.Class;

import java.util.List;

public interface ClassService {

    List<Class> getAllClasses();

    Class getClass(Long classId);

    List<Class> getClassesPersonTeaches(Long professorId);

    List<Class> getClassesPersonTakes(Long studentId);
}
