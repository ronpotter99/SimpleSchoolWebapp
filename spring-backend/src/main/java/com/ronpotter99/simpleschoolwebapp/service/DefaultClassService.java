package com.ronpotter99.simpleschoolwebapp.service;

import com.ronpotter99.simpleschoolwebapp.entity.Class;
import com.ronpotter99.simpleschoolwebapp.repository.ClassRepository;
import com.ronpotter99.simpleschoolwebapp.service.interfaces.ClassService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultClassService implements ClassService {

    private ClassRepository classRepository;

    public DefaultClassService(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    @Override
    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }

    @Override
    public List<Class> getClassesForProfessor(Long professorId) {
        return classRepository.findClassesByProfessorId(professorId);
    }

    @Override
    public Class getClass(Long classId) {
        Class toReturn = null;
        Optional<Class> foundClass = classRepository.findById(classId);

        if (foundClass.isPresent()) {
            toReturn = foundClass.get();
        }

        return toReturn;
    }
}
