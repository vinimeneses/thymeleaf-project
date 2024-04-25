package com.javaguides.thymeleaftutorial.controller;

import com.javaguides.thymeleaftutorial.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FormController {

    @GetMapping("/user-registration")
    public String userRegistrationPage(Model model) {
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);

        List<String> listProfession = List.of("Developer", "Designer", "IT Manager", "Tester");
        model.addAttribute("listProfession", listProfession);

        return "user-registration";
    }

    @PostMapping("/register/save")
    public String submitForm(Model model, @ModelAttribute("userForm") UserForm userForm) {
        model.addAttribute("userForm", userForm);
        return "register-success";
    }
}
