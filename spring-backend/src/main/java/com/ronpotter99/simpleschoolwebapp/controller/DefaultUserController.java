package com.ronpotter99.simpleschoolwebapp.controller;

import com.ronpotter99.simpleschoolwebapp.controller.interfaces.UserController;
import com.ronpotter99.simpleschoolwebapp.entity.User;
import com.ronpotter99.simpleschoolwebapp.service.interfaces.UserService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DefaultUserController implements UserController {

    private UserService userService;

    public DefaultUserController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
