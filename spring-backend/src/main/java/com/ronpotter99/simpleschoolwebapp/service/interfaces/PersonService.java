package com.ronpotter99.simpleschoolwebapp.service.interfaces;

import com.ronpotter99.simpleschoolwebapp.entity.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPeople();

    List<Person> getProfessors();
}
