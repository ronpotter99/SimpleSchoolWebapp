package com.ronpotter99.simpleschoolwebapp.service;

import com.ronpotter99.simpleschoolwebapp.entity.Person;
import com.ronpotter99.simpleschoolwebapp.repository.PersonRepository;
import com.ronpotter99.simpleschoolwebapp.service.interfaces.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultPersonService implements PersonService {

    private final PersonRepository personRepository;

    public DefaultPersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    @Override
    public List<Person> getProfessors() {
        return personRepository.findProfessors();
    }
}
