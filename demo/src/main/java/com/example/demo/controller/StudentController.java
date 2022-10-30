package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping("/getStudentInfo")
    public String getStudentInfo() {
        return "涛涛纯纯fw";
    }
}
