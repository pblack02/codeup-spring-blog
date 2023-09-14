package edu.codeup.codeupspringblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/3/and/4")
    @ResponseBody
    public String addThreePlusFour(){
        int add = 3 + 4;
       return String.format("3 + 4 = " + add);
    }

    @GetMapping("/subtract/3/from/10")
    @ResponseBody
    public String subtractThreeFromTen(){
        int subtract = 10 - 3;
        return String.format("10 - 3 = " + subtract);
    }

    @GetMapping("/multiply/4/and/5")
    @ResponseBody
    public String multiplyFourAndFive(){
        int multiply = 4 * 5;
        return String.format("4 * 5 = " + multiply);
    }

    @GetMapping("/divide/6/by/3")
    @ResponseBody
    public String divide(){
        int divided = 6 / 3;
        return String.format("6 / 3 = " + divided);
    }
}
