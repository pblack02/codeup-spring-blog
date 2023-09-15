package edu.codeup.codeupspringblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public String add(@PathVariable int num1, @PathVariable int num2){
        int add = num1 + num2;
       return String.format("%s + %s = %s", num1, num2, add);
    }

    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public String subtract(@PathVariable int num1, @PathVariable int num2){
        int subtract = num1 - num2;
        return String.format("%s - %s = %s", num2, num1, subtract);
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public String multiply (@PathVariable int num1, @PathVariable int num2){
        int multiply = num1 * num2;
        return String.format("%s * %s = %s", num1, num2, multiply);
    }

    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    public String divide(@PathVariable double num1, @PathVariable double num2){
        double divided = num1 / num2;
        return String.format("%s / %s = %s", num1, num2, divided);
    }
}
