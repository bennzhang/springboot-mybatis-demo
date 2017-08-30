package com.bennzhang.springboot.springbootmybatisdemo.mapper;

import com.bennzhang.springboot.springbootmybatisdemo.domain.Grades;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GradesMapper {
    @Select("SELECT s.name as studentName, j.name as subjectName, grade FROM students s\n" +
            "JOIN grades ON studentID = sid\n" +
            "JOIN subjects j ON subid = subjectID")
    List<Grades> getStudentsGrades();
}
