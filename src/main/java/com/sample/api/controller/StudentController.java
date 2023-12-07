package com.sample.api.controller;


import com.sample.api.model.StudentHouse;
import com.sample.api.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @RestController - exposing an endpoint starts here and allows Controller to handle the path
 */
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = {"http://localhost:8081",}, maxAge = 3000)
@RequiredArgsConstructor
public class StudentController {

    // @autowired allowing to connect this service to controller
    @Autowired
    private StudentService studentService;


    @GetMapping("/students")
    public List<StudentHouse> getStudent() {

        return this.studentService.getAllStudent();
    }

}
