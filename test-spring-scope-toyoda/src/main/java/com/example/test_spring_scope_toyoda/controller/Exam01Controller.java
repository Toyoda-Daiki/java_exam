package com.example.test_spring_scope_toyoda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

  @RequestMapping("")
  public String index() {
    return "exam01";
  }

  @RequestMapping("/result")
  public String login(String email, String password, Model model) {
    model.addAttribute(
        "result",
        ("yamada@sample.com".equals(email) && "yamayama".equals(password)) ? "成功" : "失敗");

    return "result";
  }
}
