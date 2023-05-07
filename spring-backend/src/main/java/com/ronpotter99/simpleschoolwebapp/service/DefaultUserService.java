package com.ronpotter99.simpleschoolwebapp.service;

import com.ronpotter99.simpleschoolwebapp.entity.Person;
import com.ronpotter99.simpleschoolwebapp.repository.PersonRepository;
import com.ronpotter99.simpleschoolwebapp.service.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultUserService implements UserService {

    private PersonRepository userRepository;

    public DefaultUserService(PersonRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Person> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<Person> getProfessors() {
        return userRepository.findProfessors();
    }
}
