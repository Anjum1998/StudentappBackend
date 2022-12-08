package com.example.studentappnew_backend.controller;

import com.example.studentappnew_backend.dao.StudentDao;
import com.example.studentappnew_backend.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentDao dao;
    @GetMapping("/")
    public String HomePage()
    {
        return "Welcome to my home page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddStudent(@RequestBody Students s)
   {
       System.out.println(s.getName().toString());
       System.out.println(s.getAdmno().toString());
       System.out.println(s.getRollno());
       System.out.println(s.getCollege().toString());
       dao.save(s);
       return "student added successfully";
   }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Students> ViewStudent()
   {
       return (List<Students>) dao.findAll();
   }
}
