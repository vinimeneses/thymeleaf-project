package com.javaguides.thymeleaftutorial.controller;

import com.javaguides.thymeleaftutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("fragment-expressions")
    public String fragmentExpressions(Model model) {
        return "fragment-expressions";
    }

    @GetMapping("/users")
    public String users(Model model) {
        User admin = new User("Vinícius", "viniciusmenesesdev@gmail.com", "ADMIN", "male");
        User user = new User("Maria", "mariamagalhaes@gmail.com", "USER", "female");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(user);
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/if-unless")
    public String ifUnless(Model model) {
        model.addAttribute("condition", true);
        User admin = new User("Vinícius", "viniciusmenesesdev@gmail.com", "ADMIN", "male");
        User user = new User("Maria", "mariamagalhaes@gmail.com", "USER", "female");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(user);
        model.addAttribute("users", users);
        return "if-unless";
    }

    @GetMapping("/switch-case")
    public String switchCase(Model model) {
        User user = new User("Vinícius", "viniciusmenesesdev@gmail.com", "ADMIN", "male");
        model.addAttribute("user", user);
        return "switch-case";
    }
}
