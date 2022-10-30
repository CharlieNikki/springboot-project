package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping("/getStudentInfo")
    public String getStudentInfo() {
        return "11111111涛涛纯纯fw  我错你妈11111111111妈段对";
    }
}
