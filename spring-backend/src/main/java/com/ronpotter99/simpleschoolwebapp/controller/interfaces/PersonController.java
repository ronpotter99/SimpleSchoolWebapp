package com.ronpotter99.simpleschoolwebapp.controller.interfaces;

import com.ronpotter99.simpleschoolwebapp.entity.Class;
import com.ronpotter99.simpleschoolwebapp.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface PersonController {

    @GetMapping("/person/all")
    List<Person> getAllPeople();

    @GetMapping("/person/teaches")
    List<Person> getProfessors();
}
