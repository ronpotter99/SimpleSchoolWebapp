package com.ronpotter99.simpleschoolwebapp.controller;

import com.ronpotter99.simpleschoolwebapp.controller.interfaces.UserController;
import com.ronpotter99.simpleschoolwebapp.entity.Class;
import com.ronpotter99.simpleschoolwebapp.entity.Person;
import com.ronpotter99.simpleschoolwebapp.service.interfaces.ClassService;
import com.ronpotter99.simpleschoolwebapp.service.interfaces.UserService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DefaultUserController implements UserController {

    private UserService userService;
    private ClassService classService;

    public DefaultUserController(UserService userService, ClassService classService) {
        this.userService = userService;
        this.classService = classService;
    }

    @Override
    public List<Person> getAllUsers() {
        return userService.getAllUsers();
    }

    @Override
    public List<Class> getUserClasses(Long professorId) {
        return classService.getClassesForProfessor(professorId);
    }

    @Override
    public List<Person> getProfessors() {
        return userService.getProfessors();
    }
}
