package com.amit.internship.todo_app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping
public class TodoController {
    @GetMapping()
    public String homePage(){
        return "index";
    }

    @GetMapping("/add")
    public String addPage(){
        return "add";
    }

    @GetMapping("/result")
    public String resultPage(){
        return "result";
    }
}
