package com.ronpotter99.simpleschoolwebapp.controller.interfaces;

import com.ronpotter99.simpleschoolwebapp.entity.Class;
import com.ronpotter99.simpleschoolwebapp.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserController {

    @GetMapping("/user/all")
    List<User> getAllUsers();

    @GetMapping("/user/{professorId}/teaches")
    List<Class> getUserClasses(@PathVariable("professorId") Long professorId);
}
