package com.ronpotter99.simpleschoolwebapp.controller.interfaces;

import com.ronpotter99.simpleschoolwebapp.entity.Class;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ClassController {

    @GetMapping("/class/all")
    List<Class> getAllClasses();

    @GetMapping("/class/{classId}")
    Class getClassById(@PathVariable("classId") Long classId);
}
