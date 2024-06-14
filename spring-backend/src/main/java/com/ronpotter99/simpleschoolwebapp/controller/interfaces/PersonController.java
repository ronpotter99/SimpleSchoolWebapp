package com.ronpotter99.simpleschoolwebapp.controller.interfaces;

import com.ronpotter99.simpleschoolwebapp.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface PersonController {

    @GetMapping("/person/all")
    List<Person> getAllPeople();

    @GetMapping("/person/teaches")
    List<Person> getProfessors();
}
