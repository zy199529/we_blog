package com.wmlbog.weblog.controller;

import com.wmlbog.weblog.entity.User;
import com.wmlbog.weblog.mapper.StudentMapper;
import com.wmlbog.weblog.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Controller
public class StudentController {

//    @Resource
//    private JdbcTemplate jdbcTemplate;
    @Autowired
    StudentMapper studentMapper;
    @RequestMapping("/hello")
    public String listStudent(Model model) {
        List<Student> students = studentMapper.findAll();
        model.addAttribute("students", students);
        return "hello";
    }
}
