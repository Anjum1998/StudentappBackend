package com.example.studentappnew_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/")
    public String HomePage()
    {
        return "Welcome to my home page";
    }
    @GetMapping("/contact")
    public String ContactPage()
    {
        return "Welcome to my contact page";
    }

   @GetMapping("/gallery")
   public String Gallery()
   {
       return "Welcome to my gallery";
   }
}
