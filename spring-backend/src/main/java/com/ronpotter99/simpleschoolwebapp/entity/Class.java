package com.ronpotter99.simpleschoolwebapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "class")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Class implements Serializable {

    @Id
    @Column
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String department;
    @Column
    private String code;
    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Person professor;
    @ManyToMany
    @JoinTable(
            name = "class_person_mapping",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id")
    )
    private List<Person> enrolledStudents = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Person getProfessor() {
        return professor;
    }

    public void setProfessor(Person professor) {
        this.professor = professor;
    }

    public List<Person> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Person> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Class aClass = (Class) o;

        return new EqualsBuilder()
                .append(id, aClass.id)
                .append(name, aClass.name)
                .append(department, aClass.department)
                .append(code, aClass.code)
                .append(professor, aClass.professor)
                .append(enrolledStudents, aClass.enrolledStudents)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(name)
                .append(department)
                .append(code)
                .append(professor)
                .append(enrolledStudents)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", code='" + code + '\'' +
                ", professor=" + professor +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }
}
