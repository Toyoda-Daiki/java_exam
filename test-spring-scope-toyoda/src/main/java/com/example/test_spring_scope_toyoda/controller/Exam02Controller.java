package com.example.test_spring_scope_toyoda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"formula"})
public class Exam02Controller {

    @RequestMapping("/exam02")
    public String input() {
        return "exam02";
    }

    @RequestMapping("/exam02/result")
    public String result(int num1, int num2, Model model) {

        int sum = num1 + num2;
        String formula = num1 + "+" + num2 + "＝" + sum;

        model.addAttribute("formula", formula);

        return "exam02-result";
    }

    @RequestMapping("/exam02/result2")
    public String result2() {
        return "exam02-result2";
    }
}
