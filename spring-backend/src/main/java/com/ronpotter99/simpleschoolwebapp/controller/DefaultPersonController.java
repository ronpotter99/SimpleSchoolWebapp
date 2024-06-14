package com.ronpotter99.simpleschoolwebapp.controller;

import com.ronpotter99.simpleschoolwebapp.controller.interfaces.PersonController;
import com.ronpotter99.simpleschoolwebapp.entity.Person;
import com.ronpotter99.simpleschoolwebapp.service.interfaces.ClassService;
import com.ronpotter99.simpleschoolwebapp.service.interfaces.PersonService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DefaultPersonController implements PersonController {

    private final PersonService personService;

    public DefaultPersonController(PersonService personService, ClassService classService) {
        this.personService = personService;
    }

    @Override
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    @Override
    public List<Person> getProfessors() {
        return personService.getProfessors();
    }
}
