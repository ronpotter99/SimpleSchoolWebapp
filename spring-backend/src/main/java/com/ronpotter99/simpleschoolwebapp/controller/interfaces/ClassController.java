package com.ronpotter99.simpleschoolwebapp.controller.interfaces;

import com.ronpotter99.simpleschoolwebapp.entity.Class;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ClassController {

    @GetMapping("/class/all")
    List<Class> getAllClasses();
}
