package com.sample.api.services;

import com.sample.api.model.StudentHouse;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service layer -  exposing this class as a Bean (Spring beans)
 * Bean is just a plain old Java objects (POJOs). JavaBeans are used to encapsulate data and provide access to that data using standard getter and setter methods.
 * In Spring Boot,  JavaBeans are commonly used as components or entities to represent data in an application.
 * and they play a crucial role in data encapsulation, dependency injection, data binding, and serialization/deserialization within Spring Boot applications.
 */

@Service
public class StudentService {

    public List<StudentHouse> getAllStudentList;

    public void getAllStudent() {
    }
}
