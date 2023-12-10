package com.sample.api.controller;


import com.sample.api.model.StudentHouse;
import com.sample.api.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @RestController - exposing an endpoint starts here and allows Controller to handle the path
 */
@RestController
@RequestMapping(value = "/api/students", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class StudentController {

    // @autowired allowing to connect this service to controller
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public List<StudentHouse> getStudent() {
        return this.studentService.getAllStudent();
    }

    // Pageable
//    @GetMapping("/students")
//    public List<StudentHouse> getStudentPage(Pageable page) {
//        System.out.println("page=" + page.getPageNumber());
//        return this.studentService.getAllStudent();
//    }


    /**
     * if you want to accept parameter in this method you can put annotation like @PathVariable
     * https://www.baeldung.com/spring-requestmapping
     */
    @GetMapping("/{name}")
    public List<StudentHouse> getStudentHouseByName(@PathVariable String name) {
        return this.studentService.getAllStudent();
    }


    @PostMapping("/")
    public void createStudentHouse(@RequestBody StudentHouse studentHouse) {
        System.out.println("Student house name = " + studentHouse.getName());
        System.out.println("Student House size = " + studentHouse.getSize());

    }
}
