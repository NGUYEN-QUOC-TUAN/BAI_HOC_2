package com.example.bai_hoc_2.controller;

import com.example.bai_hoc_2.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {
    @GetMapping("/form")
    public String viewForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "student/student";
    }

    @PostMapping("/save")
    public String save(Model model, @Validated @ModelAttribute("student") Student form, Errors errors) {
        if (errors.hasErrors()) {
            model.addAttribute("message", "Vui Lòng Sửa Các Lỗi Sau: ");
            return "student/student";
        }
        return "student/success";
    }
}
