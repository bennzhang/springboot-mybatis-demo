package com.bennzhang.springboot.springbootmybatisdemo.service;

import com.bennzhang.springboot.springbootmybatisdemo.domain.Grades;
import com.bennzhang.springboot.springbootmybatisdemo.mapper.GradesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class GradesService {
    @Autowired
    private GradesMapper gradesMapper;

    @GetMapping("/grades")
    public List<Grades> getAllGrades() {
        return gradesMapper.getStudentsGrades();
    }
}
