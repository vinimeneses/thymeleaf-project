package com.javaguides.thymeleaftutorial.controller;

import com.javaguides.thymeleaftutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("variable-expressions")
    public String variableExpressions(Model model) {
        User user = new User("Vinícius", "viniciusmenesesdev@gmail.com", "Admin", "male");
        model.addAttribute("user", user);
        return "variable-expressions";
    }

    @GetMapping("selection-expressions")
    public String selectionExpressions(Model model) {
        User user = new User("Vinícius", "viniciusmenesesdev@gmail.com", "Admin", "male");
        model.addAttribute("user", user);
        return "selection-expressions";
    }

    @GetMapping("message-expressions")
    public String messageExpressions(Model model) {
        return "message-expressions";
    }

    @GetMapping("link-expressions")
    public String linkExpressions(Model model) {
       model.addAttribute("id", 1);
        return "link-expressions";
    }
}
