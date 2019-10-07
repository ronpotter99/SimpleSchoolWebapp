package com.ronpotter99.simpleschoolwebapp.service;

import com.ronpotter99.simpleschoolwebapp.entity.User;
import com.ronpotter99.simpleschoolwebapp.repository.UserRepository;
import com.ronpotter99.simpleschoolwebapp.service.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultUserService implements UserService {

    private UserRepository userRepository;

    public DefaultUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
