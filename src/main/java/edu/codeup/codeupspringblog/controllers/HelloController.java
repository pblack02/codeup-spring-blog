package edu.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/world")
    @ResponseBody
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("/{name}")
    @ResponseBody
    public String helloName(@PathVariable String name){
        return "Hello, " + name + "!";
    }

}
