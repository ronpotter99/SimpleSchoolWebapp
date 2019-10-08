package com.ronpotter99.simpleschoolwebapp.controller;

import com.ronpotter99.simpleschoolwebapp.controller.interfaces.ClassController;
import com.ronpotter99.simpleschoolwebapp.entity.Class;
import com.ronpotter99.simpleschoolwebapp.service.interfaces.ClassService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DefaultClassController implements ClassController {

    private ClassService classService;

    public DefaultClassController(ClassService classService) {
        this.classService = classService;
    }

    @Override
    public List<Class> getAllClasses() {
        return classService.getAllClasses();
    }
}
